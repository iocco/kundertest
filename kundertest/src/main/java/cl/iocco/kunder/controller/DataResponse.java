package cl.iocco.kunder.controller;

public class DataResponse {
    private final String code;
    private final String description;
    private final String data;

    public DataResponse(String code, String description, String data) {
        this.code = code;
        this.data = data;
        this.description = description; 
    }

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getData() {
		return data;
	}


}
