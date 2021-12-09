package LearnPattern.FactoryPattern.controller;


import LearnPattern.FactoryPattern.dto.request.dcRequestDto;
import LearnPattern.FactoryPattern.dto.response.dcResponseDto;
import LearnPattern.FactoryPattern.dto.response.isDcResponseDto;
import LearnPattern.FactoryPattern.service.AppraisalContentService;
import LearnPattern.FactoryPattern.service.IsAppraisalContentService;
import LearnPattern.FactoryPattern.service.IsAppraisalContentServiceImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by  manhpd.ho on 07/10/2021
 */
public class isController {
    public static void main(String[] args) {
        IsAppraisalContentService appraisalContentService = new IsAppraisalContentServiceImpl();
        dcResponseDto dcResponseDto = appraisalContentService.getDetail(new dcRequestDto());
        System.out.println(dcResponseDto.s1);
        System.out.println(dcResponseDto.getClass());

        List<String> t = Arrays.asList(new String[]{"Honda", "BMW", "Ford", "Mazda"});
    }
}
