package com.view;

import java.util.Date;
import java.text.DateFormat;

import com.model.Record;

/**
 * <p>
 * Title:
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2007
 * </p>
 *
 * <p>
 * Company:
 * </p>
 *
 * @author not attributable
 * @version 1.0
 */
public final class JiSuan {
	public JiSuan() {
	}

	public static double FeiYong(String bs) {

		{
			double fee = 0;
			/* 开始时间的分钟部分 */
			int beginMinute = Integer.parseInt(Record.beginTime.substring(14, 16));
			/* 开始时间的小时部分 */
			int beginHour = Integer.parseInt(Record.beginTime.substring(11, 13));
			int beginDay = Integer.parseInt(Record.beginTime.substring(8, 10));
			int beginMonth = Integer.parseInt(Record.beginTime.substring(5, 7));
			int beginYear = Integer.parseInt(Record.beginTime.substring(0, 4));
			/* 结束时间的分钟部分 */
			int endMinute = Integer.parseInt(bs.substring(14, 16));
			/* 结束时间的小时部分 */
			int endHour = Integer.parseInt(bs.substring(11, 13));
			int endDay = Integer.parseInt(bs.substring(8, 10));
			int endMonth = Integer.parseInt(bs.substring(5, 7));
			int endYear = Integer.parseInt(bs.substring(0, 4));
			// 计算机上机时间的单位为分钟
			int playMinutes = 0;
			playMinutes = (endYear - beginYear) * 365 * 24 * 60 + (endMonth - beginMonth) * 30 * 24 * 60
					+ (endDay - beginDay) * 24 * 60 + (endHour - beginHour) * 60 + (endMinute - beginMinute);
			int modNum = playMinutes % 60;
			int playHours = 0;
			playHours = playMinutes / 60;
			// System.out.print(modNum);
			if (playHours == 0 || (modNum > 5 && playHours > 0)) {
				playHours++;
				fee = playHours * 2;
			} else if (playHours == 0 || (modNum < 4 && modNum > 3 && playHours > 0)) {
				fee = playHours * 2 + 1;
			} else if (playHours == 0 || (modNum < 3 && modNum > 2.5 && playHours > 0)) {
				fee = playHours * 2 + 0.7;
			}

			else if (playHours == 0 || (modNum < 2.5 && modNum > 0 && playHours > 0)) {
				fee = playHours * 2 + 0.5;
			} else if (playHours == 0 || (modNum < 4.5 && modNum > 3 && playHours > 0)) {
				fee = playHours * 2 + 1.5;
			}
			// fee=playMinutes*0.5;

			return fee;

		}

	}
}
