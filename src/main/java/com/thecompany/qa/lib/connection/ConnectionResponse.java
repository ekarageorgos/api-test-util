/**
 * © TheCompany QA 2019. All rights reserved.
 * CONFIDENTIAL AND PROPRIETARY INFORMATION OF TheCompany.
 */
package com.thecompany.qa.lib.connection;

public class ConnectionResponse {
	
	private int respCode;
	private String respBody;
	
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	public String getRespBody() {
		return respBody;
	}
	public void setRespBody(String respBody) {
		this.respBody = respBody;
	}
	
	@Override
	public String toString(){
		return respCode + ", " + respBody;
	}
}
