//package umc_ch6.spring.web.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import umc_ch6.spring.apiPayload.ApiResponse;
//import umc_ch6.spring.converter.TempConverter;
//import umc_ch6.spring.web.dto.TempResponse;
//
//@RestController
//@RequestMapping("/temp")
//@RequiredArgsConstructor
//public class TempRequestController {
//
//    @GetMapping("/test")
//    public ApiResponse<TempResponse.TempTestDTO> testAPI() {
//        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
//    }
//}
