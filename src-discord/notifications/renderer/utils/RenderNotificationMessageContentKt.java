package com.discord.notifications.renderer.utils;

import android.text.format.DateUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.text.DateFormat;
import java.util.Date;
import ki.f;
import ki.v;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"renderNotificationMessageContent", "", "content", "notification_renderer_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RenderNotificationMessageContentKt {
    public static final String renderNotificationMessageContent(String content) {
        CharSequence formatted;
        CharSequence t02;
        CharSequence t03;
        DateFormat dateFormat;
        q.g(content, "content");
        Regex regex = new Regex("(```(?:([a-z0-9_+\\-.]+?)\\n)?\\n*([^\\n].*?)\\n*```)");
        Regex regex2 = new Regex("((`+)([\\s\\S]*?[^`])\\2(?!`))");
        Regex regex3 = new Regex("<t:(-?\\d{1,17})(?::([tTdDfFR]))?>");
        String i10 = regex2.i(regex.i(content, RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1.INSTANCE), RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2.INSTANCE);
        while (true) {
            String str = null;
            MatchResult c10 = Regex.c(regex3, i10, 0, 2, null);
            if (c10 == null) {
                return content;
            }
            f fVar = c10.c().get(1);
            q.d(fVar);
            String a10 = fVar.a();
            f fVar2 = c10.c().get(2);
            if (fVar2 != null) {
                str = fVar2.a();
            }
            Date date = new Date(Long.parseLong(a10) * ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
            if (q.b(str, "R")) {
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
            q.f(formatted, "formatted");
            t02 = v.t0(content, c10.d().a(), c10.d().h() + 1, formatted);
            content = t02.toString();
            t03 = v.t0(i10, c10.d().a(), c10.d().h() + 1, formatted);
            i10 = t03.toString();
        }
    }
}
