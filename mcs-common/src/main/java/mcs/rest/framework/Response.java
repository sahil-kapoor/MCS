package mcs.rest.framework;

/**
 * @author sahil.kapoor
 *
 */
public class Response extends Session{

	private long code;
	private String statusMessage;
	private String devMessage;
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getDevMessage() {
		return devMessage;
	}
	public void setDevMessage(String devMessage) {
		this.devMessage = devMessage;
	}
	
}
