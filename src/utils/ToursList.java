/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;

import java.util.ArrayList;
import java.util.List;

public class ToursList {
 List<Tour> fillTourList() {
     List<Tour> list = new ArrayList<Tour>();
     list.add(new Tour("Супер Прага,Новый год 2018", Type.rest, 4, Food.UltraAllInclusive, Transport.bus));
     list.add(new Tour("Загадочный Лондон", Type.excursion, 10, Food.AllInclusivePremium, Transport.plane));
     list.add(new Tour("Карловы Вары отдых 50+", Type.treatment, 14, Food.AllInclusive, Transport.bus));
     list.add(new Tour("Затерянные в Амстердаме", Type.rest, 12, Food.UltraAllInclusive, Transport.bus));
     list.add(new Tour("Если сломался Алиэкспресс, круиз Шанхай-Хососима-Токио", Type.cruise, 15, Food.FullBoardPlus, Transport.ship));
     list.add(new Tour("Поиграем в Сталкера", Type.excursion, 7, Food.FullBoard, Transport.bus));
     list.add(new Tour("Магазы для бичей", Type.shopping, 2, Food.None, Transport.bus));
     list.add(new Tour("Малахов+", Type.treatment, 14, Food.AllInclusivePremium, Transport.bus));
     list.add(new Tour("Будь осторожен в нашем гетто, Германия за 3 дня", Type.excursion, 3, Food.AllInclusive, Transport.train));
     list.add(new Tour("Бас-тур на прощальный концерт HIM", Type.rest, 3, Food.None, Transport.bus));
     list.add(new Tour("Контрольная закупка", Type.shopping, 2, Food.FullBoard, Transport.bus));
     list.add(new Tour("Роскошь бутиков", Type.shopping, 10, Food.UltraAllInclusive, Transport.plane));
     list.add(new Tour("Плыви, пока тебя не съест Кракен", Type.cruise, 50, Food.FullBoardPlus, Transport.ship));
     list.add(new Tour("Поиски Атлантиды", Type.cruise, 50, Food.None, Transport.ship));
     list.add(new Tour("Санаторий 'Березка'", Type.treatment, 14, Food.AllInclusive, Transport.bus));
    return list;
 }
}
