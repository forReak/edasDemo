package sunbox.api.model;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ResponseVo {
    protected Integer status = 0;
    protected String result = "success";
    protected String info;
    protected Object data;
    protected Integer errorCode;
    protected Integer page;
    protected String stackInfo;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int VERIFY_ERROR = 3;
    public static final int CUSTOMER_ALEADAY = 3;

    public ResponseVo() {
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setInfoStatus(String info, Integer state) {
        this.info = info;
        this.status = state;
        switch(state) {
            case -1:
                this.result = "error";
                break;
            default:
                this.result = "success";
        }

    }

    public void setInfoStatus(Exception ex) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        this.info = sw.toString();
        this.status = -1;
        this.result = "error";
    }

    public ResponseVo setInfoStatus(String info, Integer errorCode, Integer status) {
        this.errorCode = errorCode;
        this.setInfoStatus(info, status);
        return this;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getStackInfo() {
        return this.stackInfo;
    }

    public void setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
    }

    public String toString() {
        return "";
    }
}
