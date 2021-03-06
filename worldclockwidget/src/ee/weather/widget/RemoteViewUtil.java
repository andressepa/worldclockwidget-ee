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

package ee.weather.widget;

import android.widget.RemoteViews;

public class RemoteViewUtil {
    public static void setBackgroundColor(RemoteViews rv, int viewId, int color) {
        rv.setInt(viewId, "setBackgroundColor", color);
    }

    public static void setBackground(RemoteViews rv, int viewId, int resource) {
        rv.setInt(viewId, "setBackgroundResource", resource);
    }

    public static void setTextClockTimeZone(RemoteViews rv, int viewId, String timeZone) {
        rv.setString(viewId, "setTimeZone", timeZone);
    }
}
