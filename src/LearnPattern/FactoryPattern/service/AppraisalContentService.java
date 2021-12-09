package LearnPattern.FactoryPattern.service;

import LearnPattern.FactoryPattern.dto.request.dcRequestDto;
import LearnPattern.FactoryPattern.dto.response.dcResponseDto;
import LearnPattern.FactoryPattern.dto.response.isDcResponseDto;

/**
 * Created by  manhpd.ho on 07/10/2021
 */
public interface AppraisalContentService {
    dcResponseDto getDetail(dcRequestDto dcRequestDto);
}
