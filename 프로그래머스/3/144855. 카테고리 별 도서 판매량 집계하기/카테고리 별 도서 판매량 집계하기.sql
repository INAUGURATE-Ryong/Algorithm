-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) as TOTAL_SALES
from BOOK b join BOOK_SALES s
on s.BOOK_ID = b.BOOK_ID
where s.SALES_DATE like '2022-01%'
group by b.CATEGORY
order by CATEGORY asc;