-- 코드를 입력하세요
SELECT BOARD_ID,WRITER_ID,TITLE,PRICE, 
if(STATUS ='sale', '판매중',if(status = 'reserved','예약중','거래완료')) as STATUS
from USED_GOODS_BOARD 
where date_format(CREATED_DATE,"%Y-%m-%d") = '2022-10-05'
order by BOARD_ID desc;