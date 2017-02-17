/**
 * 
 */
package com.party.hulchul.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author RKottak
 *
 */
public class HulchulResponseBuilder {

	/**
	 * This is used to build SUCCESS response resourse model
	 * 
	 * @param Object
	 * @return Response
	 */
	public static Response buildRestResp(Object response){
		String respStr = JsonParserUtil.toString(response);
		String header = MediaType.APPLICATION_JSON;
		return Response.ok().entity(header.equals(MediaType.APPLICATION_JSON) ? respStr: response).type(header).build();
	}
	
	/**
	 * This is used to build ERROR response
	 * 
	 * @param Object
	 * @return Response
	 */
	public static Response buildErrorResponse(Object response){
		String header = MediaType.APPLICATION_JSON;
		return Response.serverError().entity(response).type(header).build();
	}
}
