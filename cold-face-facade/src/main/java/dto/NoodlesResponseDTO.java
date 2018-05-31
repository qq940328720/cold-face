package dto;

public class NoodlesResponseDTO extends BaseResponseDTO {
    private Object resultData;

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "NoodlesResponseDTO{" +
                "resultData=" + resultData +
                '}';
    }
}
