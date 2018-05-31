package dto;

public class BaseResponseDTO {
    private boolean success;
    private boolean execute;
    private String message;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {
        this.execute = execute;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponseDTO{" +
                "success=" + success +
                ", execute=" + execute +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
