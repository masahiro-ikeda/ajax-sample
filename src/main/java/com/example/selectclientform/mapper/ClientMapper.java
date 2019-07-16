package com.example.selectclientform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.selectclientform.dto.ClientDto;

@Mapper
public interface ClientMapper {

	/**
	 * 選択用の取引先リストを取得する
	 *
	 * @return 取引先リスト
	 */
	public List<ClientDto> getSelectList(Map map);
}
