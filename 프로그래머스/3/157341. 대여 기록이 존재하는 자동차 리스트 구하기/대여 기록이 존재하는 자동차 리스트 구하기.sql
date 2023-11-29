-- 코드를 입력하세요
SELECT c.CAR_ID-- ,c.CAR_TYPE,h.START_DATE,h.END_DATE
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.car_id = h.car_id
where month(start_date) = '10' and CAR_TYPE = '세단'
group by c.car_id
order by car_id desc;