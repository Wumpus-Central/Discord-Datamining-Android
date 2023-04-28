package com.discord.notifications.renderer.utils;

import android.text.format.DateUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p327ri.C12567f;
import p327ri.C12588v;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m15073d2 = {"renderNotificationMessageContent", "", "content", "notification_renderer_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class RenderNotificationMessageContentKt {
    public static final String renderNotificationMessageContent(String content) {
        CharSequence formatted;
        CharSequence t0;
        CharSequence t02;
        DateFormat dateFormat;
        C9677q.m14633g(content, "content");
        Regex regex = new Regex("(```(?:([a-z0-9_+\\-.]+?)\\n)?\\n*([^\\n].*?)\\n*```)");
        Regex regex2 = new Regex("((`+)([\\s\\S]*?[^`])\\2(?!`))");
        Regex regex3 = new Regex("<t:(-?\\d{1,17})(?::([tTdDfFR]))?>");
        String i = regex2.m14581i(regex.m14581i(content, C3558xb68ee08c.INSTANCE), C3559xb68ee08d.INSTANCE);
        while (true) {
            String str = null;
            MatchResult c = Regex.m14587c(regex3, i, 0, 2, null);
            if (c == null) {
                return content;
            }
            C12567f fVar = c.mo5839d().get(1);
            C9677q.m14636d(fVar);
            String a = fVar.m5843a();
            C12567f fVar2 = c.mo5839d().get(2);
            if (fVar2 != null) {
                str = fVar2.m5843a();
            }
            Date date = new Date(Long.parseLong(a) * ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
            if (C9677q.m14638b(str, "R")) {
                formatted = DateUtils.getRelativeTimeSpanString(date.getTime());
            } else {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 68) {
                        if (hashCode != 70) {
                            if (hashCode != 84) {
                                if (hashCode != 100) {
                                    if (hashCode != 102) {
                                        if (hashCode == 116 && str.equals("t")) {
                                            dateFormat = DateFormat.getTimeInstance(3);
                                            formatted = dateFormat.format(date);
                                        }
                                    } else if (str.equals("f")) {
                                        dateFormat = DateFormat.getDateTimeInstance(1, 3);
                                        formatted = dateFormat.format(date);
                                    }
                                } else if (str.equals("d")) {
                                    dateFormat = DateFormat.getDateInstance(3);
                                    formatted = dateFormat.format(date);
                                }
                            } else if (str.equals("T")) {
                                dateFormat = DateFormat.getTimeInstance(2);
                                formatted = dateFormat.format(date);
                            }
                        } else if (str.equals("F")) {
                            dateFormat = DateFormat.getDateTimeInstance(0, 3);
                            formatted = dateFormat.format(date);
                        }
                    } else if (str.equals("D")) {
                        dateFormat = DateFormat.getDateInstance(1);
                        formatted = dateFormat.format(date);
                    }
                }
                dateFormat = DateFormat.getDateTimeInstance(1, 3);
                formatted = dateFormat.format(date);
            }
            C9677q.m14634f(formatted, "formatted");
            t0 = C12588v.m5666t0(content, c.mo5840c().m14605a(), c.mo5840c().m14604b() + 1, formatted);
            content = t0.toString();
            t02 = C12588v.m5666t0(i, c.mo5840c().m14605a(), c.mo5840c().m14604b() + 1, formatted);
            i = t02.toString();
        }
    }
}
