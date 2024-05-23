package umc_ch6.spring.apiPayload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc_ch6.spring.apiPayload.code.BaseErrorCode;
import umc_ch6.spring.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {
    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.code.getReasonHttpStatus();
    }

}
