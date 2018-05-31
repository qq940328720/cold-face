package service;

import dto.NoodlesResponseDTO;

/**
 * Created by ylj on 18-3-28.
 */
public interface NoodlesService {
    NoodlesResponseDTO getNoodlesType(String userName, String appCode);
}
