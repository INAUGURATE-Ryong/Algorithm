-- 코드를 입력하세요
SELECT WRITER_ID,NICKNAME,concat(u.city,' ',u.STREET_ADDRESS1,' ', u.STREET_ADDRESS2) as '전체주소', concat(substring(tlno from 1 for 3),'-',substring(tlno from 4 for 4),'-',substring(tlno from 8 for 4)) as 전화번호
from USED_GOODS_BOARD b join USED_GOODS_USER u
on b.WRITER_ID = u.USER_ID
group by b.WRITER_ID
having count(*) >=3
order by u.USER_ID desc;