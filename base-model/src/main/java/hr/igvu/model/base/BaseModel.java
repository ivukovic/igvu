package hr.igvu.model.base;

import static hr.igvu.model.base.MessageType.ERROR;
import static hr.igvu.model.base.MessageType.NO_DATA;
import static hr.igvu.model.base.MessageType.SUCCESS;

public class BaseModel<T> {

    protected String outMessage;
    protected String msgCode;
    protected Object[] msgParams;
    protected String msgText;
    protected String exceptionText;
    protected MessageType messageType;

    public BaseModel() {
    }

    public BaseModel(String msgCode, Object[] msgParams, MessageType messageType) {
        this.msgCode = msgCode;
        this.msgParams = msgParams;
        this.messageType = messageType;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setNoDataMsg(String msgCode) {
        this.messageType = NO_DATA;
        this.msgCode = msgCode;
    }

    public void setErrorMessage(String msgCode) {
        this.messageType = ERROR;
        this.msgCode = msgCode;
    }

    public void setSucessMessage(String msgCode) {
        this.messageType = SUCCESS;
        this.msgCode = msgCode;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public void setExceptionText(String exceptionText) {
        this.exceptionText = exceptionText;
    }

    public boolean isMsgTypeSuccess() {
        return messageType == MessageType.SUCCESS;
    }

    public boolean isSuccess() {
        return messageType == MessageType.SUCCESS || messageType == MessageType.NO_DATA;
    }

    public boolean isMsgTypeNoData() {
        return messageType == MessageType.NO_DATA;
    }

    public Object[] getMsgParams() {
        return msgParams;
    }

    public void setMsgParams(Object... msgParams) {
        this.msgParams = msgParams;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }
}
