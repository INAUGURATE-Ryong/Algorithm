-- 코드를 입력하세요
select o.ANIMAL_ID,o.NAME
from ANIMAL_INS i right join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where i.name is null and o.name is not null
-- order by name