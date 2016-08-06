package com.agent.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Json返回对象
 *
 */
@SuppressWarnings("serial")
public class JsonResponse implements Serializable{

    private static final String OK = "ok";
    private static final String ERROR = "error";

    /** 执行结果 */
    private Meta meta;
    
    /** 返回数据 */
    private Object data;
    
    /** 校验错误内容List */
    private List<ValidateError> validateErrorList = new ArrayList<>();
    
    /**
     * 成功
     * @return Json返回对象
     */
    public JsonResponse success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    /**
     * 成功
     * @param data 返回数据
     * @return Json返回对象
     */
    public JsonResponse success(Object data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    /**
     * 失败
     * @return Json返回对象
     */
    public JsonResponse failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    /**
     * 失败
     * @param message 消息内容
     * @return Json返回对象
     */
    public JsonResponse failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    /**
     * 失败
     * @param message 消息内容
     * @param validateErrorList 校验错误内容List
     * @return Json返回对象
     */
    public JsonResponse failure(String message,List<ValidateError> validateErrorList) {
        this.meta = new Meta(false, message);
        this.validateErrorList = validateErrorList;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the validateErrorList
	 */
	public List<ValidateError> getValidateErrorList() {
		return validateErrorList;
	}

	/**
	 * @param validateErrorList the validateErrorList to set
	 */
	public void setValidateErrorList(List<ValidateError> validateErrorList) {
		this.validateErrorList = validateErrorList;
	}
    
}