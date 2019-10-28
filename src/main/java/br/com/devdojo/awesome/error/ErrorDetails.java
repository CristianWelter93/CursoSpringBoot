package br.com.devdojo.awesome.error;

public class ErrorDetails {
    private String title;
    private int status;
    private String detail;
    private long timestamp;
    private String developerMessage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public static final class ErrorDetailsBuilder {
        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;

        private ErrorDetailsBuilder() {
        }

        public static ErrorDetailsBuilder newBuilder() {
            return new ErrorDetailsBuilder();
        }

        public ErrorDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ErrorDetailsBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ErrorDetailsBuilder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public ErrorDetailsBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ErrorDetailsBuilder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ErrorDetails build() {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setTitle(title);
            errorDetails.setStatus(status);
            errorDetails.setDetail(detail);
            errorDetails.setTimestamp(timestamp);
            errorDetails.setDeveloperMessage(developerMessage);
            return errorDetails;
        }
    }
}
