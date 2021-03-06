/*
 * Copyright (C) 2012  Armin Häberling
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package ee.weather.worldclock.compatibility;

public class WeatherWidgetProvider4x2 extends CompatWeatherWidgetProvider {

    static {
        registerWeatherWidget(WeatherWidgetProvider4x2.class);
    }

    public WeatherWidgetProvider4x2() {
        super(4, LAYOUT_TWO_COLUMNS);
    }

}
