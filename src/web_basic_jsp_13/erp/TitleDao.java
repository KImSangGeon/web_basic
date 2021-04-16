package web_basic_jsp_13.erp;

import java.util.List;

/**
 * 	C(insert)
 *  R(select, select where)
 *  U(update)
 *  D(delete)
 *
 */
public interface TitleDao {
	
	List<Title> selectTitleByAll();
	Title selectTitleByNo(Title title);    // int tNo해도 상관없음 (매개변수)
	
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(int titleNo);
		
}






