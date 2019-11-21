package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.Detail;
import pl.jaszczomb.appserverside.dto.embedded.DetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DetailMapper {

    @Autowired private AddressMapper addressMapper;

    public DetailDto mapToDetailDto(Detail detail) {
        return new DetailDto(detail.isPaid(), detail.isCancelled(), detail.getPayerId(),
                detail.getPaymentId(), detail.getPaymentToken(), detail.getReturnUrl(),
                addressMapper.mapToAddressDto(detail.getAddress()), detail.getEmail());
    }

    public Detail mapToDetail(DetailDto detailDto) {
        return new Detail(detailDto.isPaid(), detailDto.isCancelled(), detailDto.getPayerId(),
                detailDto.getPaymentId(), detailDto.getPaymentToken(), detailDto.getReturnUrl(),
                addressMapper.mapToAddress(detailDto.getAddress()), detailDto.getEmail());
    }

    public List<DetailDto> mapToDetailDtoList(List<Detail> details) {
        return details.stream()
                .map(this::mapToDetailDto)
                .collect(Collectors.toList());
    }

    public List<Detail> mapToDetailList(List<DetailDto> detailDtos) {
        return detailDtos.stream()
                .map(this::mapToDetail)
                .collect(Collectors.toList());
    }
}
