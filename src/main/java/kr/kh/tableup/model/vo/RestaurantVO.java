package kr.kh.tableup.model.vo;

import lombok.Data;

@Data
public class RestaurantVO {
	
	int rt_num;
	String rt_name;
	int rt_dreg_num;
	int rt_dfc_num;
	String rt_closed_days;
	String rt_price_lunch;
	String rt_price_dinner;
	String rt_accept;
	String rt_description;
}
