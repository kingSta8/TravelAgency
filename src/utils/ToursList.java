/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Food;
import beans.Tour;
import beans.Transport;
import beans.Type;

import java.util.ArrayList;
import java.util.List;

public class ToursList {
 static List<Tour> fillToursList() {
     List<Tour> list = new ArrayList<Tour>();
     list.add(new Tour("Супер Прага,Новый год 2018", Type.отдых, 4, Food.UltraAllInclusive, Transport.автобус));
     list.add(new Tour("Загадочный Лондон", Type.экскурсия, 10, Food.AllInclusivePremium, Transport.самолет));
     list.add(new Tour("Карловы Вары отдых 50+", Type.лечение, 14, Food.AllInclusive, Transport.автобус));
     list.add(new Tour("Затерянные в Амстердаме", Type.отдых, 12, Food.UltraAllInclusive, Transport.автобус));
     list.add(new Tour("Если сломался Алиэкспресс, круиз Шанхай-Хососима-Токио", Type.круиз, 15, Food.FullBoardPlus, Transport.лайнер));
     list.add(new Tour("Поиграем в Сталкера, экскурсия на ЧАЭС", Type.экскурсия, 7, Food.FullBoard, Transport.автобус));
     list.add(new Tour("Магазы для бичей", Type.шоппинг, 2, Food.None, Transport.автобус));
     list.add(new Tour("Малахов+", Type.лечение, 14, Food.AllInclusivePremium, Transport.автобус));
     list.add(new Tour("Будь осторожен в нашем гетто, Германия за неделю", Type.экскурсия, 7, Food.AllInclusive, Transport.поезд));
     list.add(new Tour("Бас-тур на прощальный концерт HIM", Type.отдых, 3, Food.None, Transport.автобус));
     list.add(new Tour("Контрольная закупка", Type.шоппинг, 2, Food.FullBoard, Transport.автобус));
     list.add(new Tour("Роскошь бутиков", Type.шоппинг, 10, Food.UltraAllInclusive, Transport.самолет));
     list.add(new Tour("Плыви, пока тебя не съест Кракен", Type.круиз, 50, Food.FullBoardPlus, Transport.лайнер));
     list.add(new Tour("Поиски Атлантиды", Type.круиз, 50, Food.None, Transport.лайнер));
     list.add(new Tour("Санаторий 'Березка'", Type.лечение, 14, Food.AllInclusive, Transport.автобус));
    return list;
 }
}
