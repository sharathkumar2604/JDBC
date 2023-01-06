package com.xworkz.telivison.repositary;

import java.util.List;

import com.xworkz.telivison.dto.TelivisionDTO;

public interface TelivisionRepo {

public	boolean save(TelivisionDTO dto);

public List<TelivisionDTO> read();

public TelivisionDTO FindNameBySize(int size);

public boolean UpdateSizeByType(int size, String type);

public boolean deleteNameByColor(String color);




}
