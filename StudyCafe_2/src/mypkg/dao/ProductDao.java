package mypkg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mypkg.bean.Product;

public class ProductDao extends SuperDao {
	
	public int DeleteData(String p_seat) {		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = -999999;
		
		try {
			conn = super.getConnection();
									
			String sql = " update orders set remark = ?  " ;
			sql += " where or_seat = ?" ; 			
			pstmt = conn.prepareStatement(sql) ;
			
			Product bean = this.SelectDataByPk(p_seat) ;

			String imsi = "좌석 " + bean.getP_seat() + "이(가) 삭제되었습니다." ;			
			
			pstmt.setString(1, imsi); // 문자열
			pstmt.setString(2, p_seat); // 좌석 번호
			cnt = pstmt.executeUpdate() ; 
			pstmt.close();
			// 해당 좌석을 삭제
			sql = " delete from products " ;
			sql += " where p_seat = ? " ;
			
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1, p_seat); // 좌석 번호
			cnt = pstmt.executeUpdate();
			
			conn.commit();
			
		} catch (Exception e) {
			SQLException err = (SQLException)e;
			cnt = - err.getErrorCode();
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally{
			try {
				if(pstmt != null){pstmt.close();}
				if(conn != null){conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}
	
	
	public int UpdateData(Product bean) {
		System.out.println(bean.toString() ); 

		Connection conn = null ;
		PreparedStatement pstmt = null ;

		String sql = " update products set " ;
		sql += " p_type = ?, p_date= ?, p_stime = ?, p_etime = ?, p_hour = ?, p_price = ?, p_pic = ? , remark = ? " ;
		sql += " where p_seat = ? ";
		
		int cnt = -999999;
		try {
			conn = super.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bean.getP_type());
			pstmt.setString(2, bean.getP_date());
			pstmt.setInt(3, bean.getP_stime());
			pstmt.setInt(4, bean.getP_etime());
			pstmt.setInt(5, bean.getP_hour());
			pstmt.setInt(6, bean.getP_price());
			pstmt.setString(7, bean.getP_pic());
			pstmt.setString(8, bean.getRemark());
			pstmt.setString(9, bean.getP_seat());
			
			cnt = pstmt.executeUpdate() ; 
			conn.commit(); 
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			cnt = - err.getErrorCode() ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally{
			try {
				if(pstmt != null ){ pstmt.close(); }
				if(conn != null){conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}
	
	//해당 Bean객체를 사용해 상품 등록하기
	public int InsertData(Product bean) {
		System.out.println("상품을 등록합니다.");
		String sql = " insert into products( p_type, p_seat, p_date, p_stime, p_etime, p_hour, p_price, p_pic, remark )";
		sql += " values (?, ?, to_date(?, 'yyyy/MM/dd'), ?, ?, ?, ?, ?, ?) ";
		
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		
		int cnt = -999999 ;
		try {
			conn = super.getConnection() ;
			conn.setAutoCommit( false );
			pstmt = conn.prepareStatement(sql) ;
			
			pstmt.setString(1, bean.getP_type());
			pstmt.setString(2, bean.getP_seat());
			pstmt.setString(3, bean.getP_date());
			pstmt.setInt(4, bean.getP_stime());
			pstmt.setInt(5, bean.getP_etime());
			pstmt.setInt(6, bean.getP_hour());
			pstmt.setInt(7, bean.getP_price());
			pstmt.setString(8, bean.getP_pic());
			pstmt.setString(9, bean.getRemark());
			
			cnt = pstmt.executeUpdate() ; 
			conn.commit(); 
			
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			cnt = - err.getErrorCode() ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} finally{
			try {
				if( pstmt != null ){ pstmt.close(); }
				if(conn != null){conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}
	


	//페이징 처리와 필드 검색을 통한 상품 목록 구하기
	public List<Product> SelectDataList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = " select p_type, p_seat, p_date, p_stime, p_etime, p_hour, p_price, p_pic, remark ";
		sql += " from products order by p_type asc";
				
		
		List<Product> lists = new ArrayList<Product>();
		
		try {
			conn = super.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Product bean = new Product();
				
				bean.setP_type(rs.getString("p_type"));
				bean.setP_seat(rs.getString("p_seat"));
				bean.setP_date(rs.getString("p_date"));
				bean.setP_stime(rs.getInt("p_stime"));
				bean.setP_etime(rs.getInt("p_etime"));
				bean.setP_hour(rs.getInt("p_hour"));
				bean.setP_price(rs.getInt("p_price"));
				bean.setP_pic(rs.getString("p_pic"));
				bean.setRemark(rs.getString("remark"));
				
				lists.add(bean);
			}
			
		} catch (Exception e) {
			SQLException err = (SQLException)e;
			int cnt = - err.getErrorCode();
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if(rs != null){ rs.close(); }
				if(pstmt != null){ pstmt.close(); }
				if(conn != null){conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return lists;
	}
	
	
	
	//해당 검색모드에 충족하는 항목들의 개수 구하기
	public int SelectTotalCount(String mode, String keyword) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = " select count(*) as cnt from products ";
		
		if(mode.equalsIgnoreCase("all") == false) {
			sql += " where " + mode + " like '" + keyword + "'";
		}
		
		int cnt = -999999;
		
		try {
			conn = super.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
			
		} catch (SQLException e) {
			SQLException err = (SQLException) e;
			cnt = - err.getErrorCode();
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt;
	}
	
	public Product SelectDataByPk(String p_seat) {
		Product bean = null ;
		
		String sql = "select * " ;
		sql += " from products " ; 
		sql += " where p_seat = ? " ;
		
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		try {
			conn = super.getConnection() ;
			pstmt = conn.prepareStatement(sql) ;

			pstmt.setString(1, p_seat); 
						
			rs = pstmt.executeQuery() ;
			
			while(rs.next()) {
				bean = new Product() ;
				
				bean.setP_type(rs.getString("p_type"));
				bean.setP_seat(rs.getString("p_seat"));
				bean.setP_date(rs.getString("p_date"));
				bean.setP_stime(rs.getInt("p_stime"));
				bean.setP_etime(rs.getInt("p_etime"));
				bean.setP_hour(rs.getInt("p_hour"));
				bean.setP_price(rs.getInt("p_price"));
				bean.setP_pic(rs.getString("p_pic"));
				bean.setRemark(rs.getString("remark"));
	
			}
			System.out.println("ok!!");
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return bean  ;
	}


	public List<Product> SelectDataByType(String p_type) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = " select p_type, p_seat, p_date, p_stime, p_etime, p_hour, p_price, p_pic, remark ";
		sql += " from products where p_type = ? order by p_seat asc";
				
		
		List<Product> glists = new ArrayList<Product>();
		
		try {
			conn = super.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, p_type);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Product bean = new Product();
				
				bean.setP_type(rs.getString("p_type"));
				bean.setP_seat(rs.getString("p_seat"));
				bean.setP_date(rs.getString("p_date"));
				bean.setP_stime(rs.getInt("p_stime"));
				bean.setP_etime(rs.getInt("p_etime"));
				bean.setP_hour(rs.getInt("p_hour"));
				bean.setP_price(rs.getInt("p_price"));
				bean.setP_pic(rs.getString("p_pic"));
				bean.setRemark(rs.getString("remark"));
				
				glists.add(bean);
			}
			
		} catch (Exception e) {
			SQLException err = (SQLException)e;
			int cnt = - err.getErrorCode();
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if(rs != null){ rs.close(); }
				if(pstmt != null){ pstmt.close(); }
				if(conn != null){conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return glists;
	}
	

}




