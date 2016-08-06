package com.agent.common;

import java.io.Serializable;

/**
 * 执行结果
 *
 */
@SuppressWarnings("serial")
public class Meta implements Serializable{

	/** 是否成功 */
    private boolean success;

	/** 消息内容 */
    private String message;
    
    /**
     * 构造执行结果
     */
    public Meta() {
    	
    }

    /**
     * 构造执行结果
     * @param success 是否成功
     */
    public Meta(boolean success) {
        this.success = success;
    }

    /**
     * 构造执行结果
     * @param success 是否成功
     * @param message 消息内容
     */
    public Meta(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * @return the value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}