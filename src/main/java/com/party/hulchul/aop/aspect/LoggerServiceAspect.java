package com.party.hulchul.aop.aspect;

import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <h1>This class is the aspect that defines the pointcuts and the associated
 * aspects to inject</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

@Aspect
@Component
public class LoggerServiceAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
	public void loggingController() {
	}

	@Pointcut("within(com.party.hulchul.service..*)")
	private void loggingService() {
	}

	@Pointcut("within(com.party.hulchul.dao..*)")
	private void loggingDao() {
	}

	@Pointcut("execution(* *.*(..))")
	protected void loggingAllMethods() {
	}

	@Pointcut("execution(* com.party.hulchul.dao.impl.CustomerSearchRepositoryImpl.searchCustomerByCustomString(..))")
	protected void loggingSearchMethod() {
	}

	@Pointcut("execution(public * *(..))")
	protected void loggingPublicOperations() {
	}

	@Pointcut("execution(* *.*(..))")
	protected void loggingAllOperations() {
	}

	@Before("loggingController() && loggingAllMethods() && args(..,request)")
	public void logBefore(JoinPoint joinPoint, HttpServletRequest request) {
		logger.info("Entering in the method : " + joinPoint.getSignature().getName());
		logger.info("Method Type : " + request.getMethod());

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			logger.info("Header Name: " + headerName + " Header Value : " + headerValue);
		}
		logger.info("Request Path info :" + request.getServletPath());

		logger.info("End Header Section of request ");
	}

	@AfterReturning(pointcut = "loggingDao() && loggingAllMethods()", returning = "result")
	public void logAfter(JoinPoint joinPoint, Object result) {
		String returnValue = this.getValue(result);
		logger.info("Method Return value : " + returnValue);
	}

	@AfterReturning(pointcut = "loggingSearchMethod()", returning = "result")
	public void logAfterSearchMethod(JoinPoint joinPoint, Object result) {

		String returnValue = this.getValue(result);
		logger.info("************************** : " + returnValue);
		logger.info(joinPoint.getSignature().getName());
		logger.info(joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Method Return value : " + returnValue);
		logger.info("End ************************** : End");
	}

	@AfterThrowing(pointcut = "loggingDao() && loggingAllMethods()", throwing = "exception")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
		logger.info("An exception has been thrown in " + joinPoint.getSignature().getName() + " ()");
		logger.info("Cause : " + exception.getCause());
	}

	@Around("loggingDao() && loggingAllMethods()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		long start = System.currentTimeMillis();
		try {
			String className = joinPoint.getSignature().getDeclaringTypeName();
			String methodName = joinPoint.getSignature().getName();
			Object result = joinPoint.proceed();
			long elapsedTime = System.currentTimeMillis() - start;
			logger.info("Method " + className + "." + methodName + " ()" + " execution time : " + elapsedTime + " ms");

			return result;
		} catch (IllegalArgumentException e) {
			logger.info("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in "
					+ joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}

	private String getValue(Object result) {
		String returnValue = null;
		if (null != result) {
			if (result.toString().endsWith("@" + Integer.toHexString(result.hashCode()))) {
				returnValue = ReflectionToStringBuilder.toString(result);
			} else {
				returnValue = result.toString();
			}
		}
		return returnValue;
	}
}
