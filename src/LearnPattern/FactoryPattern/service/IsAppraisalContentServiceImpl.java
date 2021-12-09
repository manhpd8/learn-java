package LearnPattern.FactoryPattern.service;

import LearnPattern.FactoryPattern.dto.request.dcRequestDto;
import LearnPattern.FactoryPattern.dto.response.dcResponseDto;
import LearnPattern.FactoryPattern.dto.response.isDcResponseDto;

/**
 * Created by  manhpd.ho on 07/10/2021
 */
public class IsAppraisalContentServiceImpl implements IsAppraisalContentService {
    @Override
    public dcResponseDto getDetail(dcRequestDto dcRequestDto) {
        isDcResponseDto req = new isDcResponseDto();
        req.s1="s1";
        req.s2="s2";
        return req;
    }
}
