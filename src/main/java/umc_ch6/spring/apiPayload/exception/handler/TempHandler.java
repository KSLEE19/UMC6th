package umc_ch6.spring.apiPayload.exception.handler;

import umc_ch6.spring.apiPayload.code.BaseErrorCode;
import umc_ch6.spring.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode code) {
        super(code);
    }
}
