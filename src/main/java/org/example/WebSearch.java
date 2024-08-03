package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebSearch {
        String url = "https://roblox-bear.fandom.com/wiki/Unwell"; //- замените Unwell с Malbear или Bear что-бы получить другой результат

        public void printResult() {

            try {
                // Завантажуємо HTML документ з URL
                Document doc = Jsoup.connect(url).get();

                // Вибираємо всі елементи <a> (посилання)
                Elements links = doc.select("#mw-content-text > div > aside > h2");
                Elements info = doc.select("#mw-content-text > div > p");

                // Проходимо по всіх знайдених посиланнях
                for (Element link : links) {
                    // Виводимо текст посилання та сам URL
                    System.out.println("character name: " + link.text());
                    System.out.println("Total info: " + info.text());
                    System.out.println("------");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}