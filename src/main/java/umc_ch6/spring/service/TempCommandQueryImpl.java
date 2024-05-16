package umc_ch6.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc_ch6.spring.apiPayload.code.status.ErrorStatus;
import umc_ch6.spring.apiPayload.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempCommandQueryImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1) {
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
        }
    }
}
