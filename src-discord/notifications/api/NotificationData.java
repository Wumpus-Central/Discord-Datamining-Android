package com.discord.notifications.api;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0003\b \u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ã\u00012\u00020\u0001:\u0004â\u0001ã\u0001Bª\u0004\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010/\u001a\u000200\u0012\b\b\u0001\u00101\u001a\u000200\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u000100\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010:\u001a\u0004\u0018\u00010;ø\u0001\u0000¢\u0006\u0002\u0010<B\u0088\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\b\b\u0002\u00101\u001a\u000200\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006ø\u0001\u0000¢\u0006\u0002\u0010=J\n\u0010£\u0001\u001a\u00020\u0006HÆ\u0003J\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b¥\u0001J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b©\u0001J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018HÆ\u0003ø\u0001\u0000J\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u00ad\u0001J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u001d\u0010±\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b²\u0001\u0010DJ\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\u001b\u0010¶\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b·\u0001J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001b\u0010¼\u0001\u001a\u0004\u0018\u00010(HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b½\u0001J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\n\u0010Ä\u0001\u001a\u000200HÆ\u0003J\n\u0010Å\u0001\u001a\u000200HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Í\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010bJ\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010}J\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010GJ\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009b\u0004\u0010Ô\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u0001002\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0015\u0010×\u0001\u001a\u0002002\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010Ú\u0001\u001a\u00020\u0006HÖ\u0001J(\u0010Û\u0001\u001a\u00030Ü\u00012\u0007\u0010Ý\u0001\u001a\u00020\u00002\b\u0010Þ\u0001\u001a\u00030ß\u00012\b\u0010à\u0001\u001a\u00030á\u0001HÇ\u0001R%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001e\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010?\u001a\u0004\bC\u0010DR \u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bE\u0010?\u001a\u0004\bF\u0010GR\u001e\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010?\u001a\u0004\bJ\u0010DR'\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010?\u001a\u0004\bL\u0010MR\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010?\u001a\u0004\bO\u0010DR\u001c\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010?\u001a\u0004\bQ\u0010RR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010?\u001a\u0004\bT\u0010DR'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010?\u001a\u0004\bV\u0010WR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010?\u001a\u0004\bY\u0010DR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010?\u001a\u0004\b[\u0010DR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\b\\\u0010?\u001a\u0004\b]\u0010GR\u001e\u00107\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010?\u001a\u0004\b_\u0010DR \u00108\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010c\u0012\u0004\b`\u0010?\u001a\u0004\ba\u0010bR\u001e\u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u0010?\u001a\u0004\be\u0010DR'\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010?\u001a\u0004\bg\u0010hR\u001e\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u0010?\u001a\u0004\bj\u0010DR \u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bk\u0010?\u001a\u0004\bl\u0010GR\u001e\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010?\u001a\u0004\bn\u0010DR\u001e\u00109\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u0010?\u001a\u0004\bp\u0010DR\u001c\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u0010?\u001a\u0004\b1\u0010RR\u001e\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010?\u001a\u0004\bs\u0010tR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010H\u0012\u0004\bu\u0010?\u001a\u0004\bv\u0010GR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010?\u001a\u0004\bx\u0010DR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010?\u001a\u0004\bz\u0010DR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010~\u0012\u0004\b{\u0010?\u001a\u0004\b|\u0010}R+\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0003\u0010\u0081\u0001\u0012\u0004\b\u007f\u0010?\u001a\u0005\b\u0080\u0001\u0010DR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010H\u0012\u0005\b\u0082\u0001\u0010?\u001a\u0005\b\u0083\u0001\u0010GR \u00105\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010?\u001a\u0005\b\u0085\u0001\u0010DR)\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0000\u0012\u0005\b\u0086\u0001\u0010?\u001a\u0005\b\u0087\u0001\u0010WR \u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0088\u0001\u0010?\u001a\u0005\b\u0089\u0001\u0010DR\"\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010H\u0012\u0005\b\u008a\u0001\u0010?\u001a\u0005\b\u008b\u0001\u0010GR \u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008c\u0001\u0010?\u001a\u0005\b\u008d\u0001\u0010DR \u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008e\u0001\u0010?\u001a\u0005\b\u008f\u0001\u0010DR \u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0090\u0001\u0010?\u001a\u0005\b\u0091\u0001\u0010DR \u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0092\u0001\u0010?\u001a\u0005\b\u0093\u0001\u0010DR\u001e\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0094\u0001\u0010?\u001a\u0005\b\u0095\u0001\u0010DR \u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0096\u0001\u0010?\u001a\u0005\b\u0097\u0001\u0010DR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010H\u0012\u0005\b\u0098\u0001\u0010?\u001a\u0005\b\u0099\u0001\u0010GR \u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009a\u0001\u0010?\u001a\u0005\b\u009b\u0001\u0010DR \u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009c\u0001\u0010?\u001a\u0005\b\u009d\u0001\u0010DR*\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0011\n\u0000\u0012\u0005\b\u009e\u0001\u0010?\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¡\u0001\u0010?\u001a\u0005\b¢\u0001\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ä\u0001"}, d2 = {"Lcom/discord/notifications/api/NotificationData;", "", "seen1", "", "seen2", "type", "", "messageId", "Lcom/discord/primitives/MessageId;", "messageActivityType", "messageApplicationName", "messageType", "messageContent", "messageFlags", "", "channelType", "channelName", "channelId", "Lcom/discord/primitives/ChannelId;", "channelIcon", "parentName", "parentId", "channelRtcRegion", "ackChannelIds", "", "userId", "Lcom/discord/primitives/UserId;", "userUsername", "userGlobalName", "userDiscriminator", "userAvatar", "userGuildAvatar", "relationshipType", "guildId", "Lcom/discord/primitives/GuildId;", "guildName", "guildIcon", "activityType", "activityName", "applicationId", "Lcom/discord/primitives/ApplicationId;", "applicationName", "applicationIcon", "message", "Lcom/discord/notifications/api/NotificationMessage;", "stageInstanceTopic", "guildScheduledEventEntityType", "canReply", "", "isFromCurrentUser", "title", "subtitle", "iconUrl", "notificationChannel", "trackingType", "deeplink", "expandSubtitle", "imageAttachmentUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAckChannelIds$annotations", "()V", "getAckChannelIds", "()Ljava/util/List;", "getActivityName$annotations", "getActivityName", "()Ljava/lang/String;", "getActivityType$annotations", "getActivityType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getApplicationIcon$annotations", "getApplicationIcon", "getApplicationId-UtIrSio$annotations", "getApplicationId-UtIrSio", "()Lcom/discord/primitives/ApplicationId;", "getApplicationName$annotations", "getApplicationName", "getCanReply$annotations", "getCanReply", "()Z", "getChannelIcon$annotations", "getChannelIcon", "getChannelId-qMVnFVQ$annotations", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getChannelName$annotations", "getChannelName", "getChannelRtcRegion$annotations", "getChannelRtcRegion", "getChannelType$annotations", "getChannelType", "getDeeplink$annotations", "getDeeplink", "getExpandSubtitle$annotations", "getExpandSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGuildIcon$annotations", "getGuildIcon", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getGuildName$annotations", "getGuildName", "getGuildScheduledEventEntityType$annotations", "getGuildScheduledEventEntityType", "getIconUrl$annotations", "getIconUrl", "getImageAttachmentUrl$annotations", "getImageAttachmentUrl", "isFromCurrentUser$annotations", "getMessage$annotations", "getMessage", "()Lcom/discord/notifications/api/NotificationMessage;", "getMessageActivityType$annotations", "getMessageActivityType", "getMessageApplicationName$annotations", "getMessageApplicationName", "getMessageContent$annotations", "getMessageContent", "getMessageFlags$annotations", "getMessageFlags", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessageId-N_6c4I0$annotations", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getMessageType$annotations", "getMessageType", "getNotificationChannel$annotations", "getNotificationChannel", "getParentId-qMVnFVQ$annotations", "getParentId-qMVnFVQ", "getParentName$annotations", "getParentName", "getRelationshipType$annotations", "getRelationshipType", "getStageInstanceTopic$annotations", "getStageInstanceTopic", "getSubtitle$annotations", "getSubtitle", "getTitle$annotations", "getTitle", "getTrackingType$annotations", "getTrackingType", "getType$annotations", "getType", "getUserAvatar$annotations", "getUserAvatar", "getUserDiscriminator$annotations", "getUserDiscriminator", "getUserGlobalName$annotations", "getUserGlobalName", "getUserGuildAvatar$annotations", "getUserGuildAvatar", "getUserId-wUX8bhU$annotations", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getUserUsername$annotations", "getUserUsername", "component1", "component10", "component10-qMVnFVQ", "component11", "component12", "component13", "component13-qMVnFVQ", "component14", "component15", "component16", "component16-wUX8bhU", "component17", "component18", "component19", "component2", "component2-N_6c4I0", "component20", "component21", "component22", "component23", "component23-qOKuAAo", "component24", "component25", "component26", "component27", "component28", "component28-UtIrSio", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "copy-NwZg3Ig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/discord/notifications/api/NotificationData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class NotificationData {
    public static final int ACTIVITY_TYPE_PLAYING = 0;
    public static final int ACTIVITY_TYPE_STREAMING = 1;
    public static final int CHANNEL_TYPE_ANNOUNCEMENT_THREAD = 10;
    public static final int CHANNEL_TYPE_CATEGORY = 4;
    public static final int CHANNEL_TYPE_DIRECTORY = 14;
    public static final int CHANNEL_TYPE_DM = 1;
    public static final int CHANNEL_TYPE_GROUP_DM = 3;
    public static final int CHANNEL_TYPE_GUILD_ANNOUNCEMENT = 5;
    public static final int CHANNEL_TYPE_GUILD_STAGE_VOICE = 13;
    public static final int CHANNEL_TYPE_GUILD_STORE = 6;
    public static final int CHANNEL_TYPE_GUILD_TEXT = 0;
    public static final int CHANNEL_TYPE_GUILD_VOICE = 2;
    public static final int CHANNEL_TYPE_PRIVATE_THREAD = 12;
    public static final int CHANNEL_TYPE_PUBLIC_THREAD = 11;
    public static final Companion Companion = new Companion(null);
    public static final int GUILD_SCHEDULED_EVENT_TYPE_EXTERNAL = 3;
    public static final int GUILD_SCHEDULED_EVENT_TYPE_NONE = 0;
    public static final int GUILD_SCHEDULED_EVENT_TYPE_STAGE_INSTANCE = 1;
    public static final int GUILD_SCHEDULED_EVENT_TYPE_VOICE = 2;
    public static final int MESSAGE_ACTIVITY_TYPE_JOIN = 1;
    public static final int MESSAGE_ACTIVITY_TYPE_LISTEN = 3;
    public static final int MESSAGE_ACTIVITY_TYPE_REQUEST = 5;
    public static final int MESSAGE_ACTIVITY_TYPE_SPECTATE = 2;
    public static final int MESSAGE_ACTIVITY_TYPE_WATCH = 4;
    public static final int MESSAGE_TYPE_USER_JOIN = 7;
    public static final int MSG_MUTE_MIN_COUNT = 2;
    public static final int RELATIONSHIP_TYPE_FRIEND = 1;
    public static final int RELATIONSHIP_TYPE_INVITE_INCOMING = 3;
    public static final String TRACKING_TYPE_FRIEND_REQUEST_REMINDER = "generic_friend_request_reminder";
    public static final String TRACKING_TYPE_GUILD_STREAM_START = "GUILD_STREAM_START";
    public static final String TRACKING_TYPE_HOME_LIFECYCLE_PUSH = "home_lifecycle_push";
    public static final String TRACKING_TYPE_MISSED_MESSAGE = "generic_missed_message";
    public static final String TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE = "generic_home_featured_message";
    public static final String TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH = "nudge_new_friend_dm_push";
    public static final String TRACKING_TYPE_SUSPICIOUS_SESSION = "suspicious_session";
    public static final String TRACKING_TYPE_TOP_MESSAGES_PUSH = "top_messages_push";
    public static final String TRACKING_TYPE_TRENDING_CONTENT_PUSH = "trending_content_push";
    public static final String TYPE_ACTIVITY_START = "ACTIVITY_START";
    public static final String TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE = "APPLICATION_LIBRARY_INSTALL_COMPLETE";
    public static final String TYPE_CALL_CONNECT = "CALL_CONNECT";
    public static final String TYPE_CALL_RING = "CALL_RING";
    public static final String TYPE_CHANNEL_ACK = "CHANNEL_ACK";
    public static final String TYPE_FORUM_THREAD_CREATED = "FORUM_THREAD_CREATED";
    public static final String TYPE_FRIEND_SUGGESTION_CREATE = "FRIEND_SUGGESTION_CREATE";
    public static final String TYPE_GENERIC_PUSH_NOTIFICATION_SENT = "GENERIC_PUSH_NOTIFICATION_SENT";
    public static final String TYPE_GUILD_SCHEDULED_EVENT_UPDATE = "GUILD_SCHEDULED_EVENT_UPDATE";
    public static final String TYPE_MESSAGE_CREATE = "MESSAGE_CREATE";
    public static final String TYPE_RELATIONSHIP_ADD = "RELATIONSHIP_ADD";
    public static final String TYPE_STAGE_INSTANCE_CREATE = "STAGE_INSTANCE_CREATE";
    private final List<ChannelId> ackChannelIds;
    private final String activityName;
    private final Integer activityType;
    private final String applicationIcon;
    private final ApplicationId applicationId;
    private final String applicationName;
    private final boolean canReply;
    private final String channelIcon;
    private final ChannelId channelId;
    private final String channelName;
    private final String channelRtcRegion;
    private final Integer channelType;
    private final String deeplink;
    private final Boolean expandSubtitle;
    private final String guildIcon;
    private final GuildId guildId;
    private final String guildName;
    private final Integer guildScheduledEventEntityType;
    private final String iconUrl;
    private final String imageAttachmentUrl;
    private final boolean isFromCurrentUser;
    private final NotificationMessage message;
    private final Integer messageActivityType;
    private final String messageApplicationName;
    private final String messageContent;
    private final Long messageFlags;
    private final String messageId;
    private final Integer messageType;
    private final String notificationChannel;
    private final ChannelId parentId;
    private final String parentName;
    private final Integer relationshipType;
    private final String stageInstanceTopic;
    private final String subtitle;
    private final String title;
    private final String trackingType;
    private final String type;
    private final String userAvatar;
    private final Integer userDiscriminator;
    private final String userGlobalName;
    private final String userGuildAvatar;
    private final UserId userId;
    private final String userUsername;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020706HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/discord/notifications/api/NotificationData$Companion;", "", "()V", "ACTIVITY_TYPE_PLAYING", "", "ACTIVITY_TYPE_STREAMING", "CHANNEL_TYPE_ANNOUNCEMENT_THREAD", "CHANNEL_TYPE_CATEGORY", "CHANNEL_TYPE_DIRECTORY", "CHANNEL_TYPE_DM", "CHANNEL_TYPE_GROUP_DM", "CHANNEL_TYPE_GUILD_ANNOUNCEMENT", "CHANNEL_TYPE_GUILD_STAGE_VOICE", "CHANNEL_TYPE_GUILD_STORE", "CHANNEL_TYPE_GUILD_TEXT", "CHANNEL_TYPE_GUILD_VOICE", "CHANNEL_TYPE_PRIVATE_THREAD", "CHANNEL_TYPE_PUBLIC_THREAD", "GUILD_SCHEDULED_EVENT_TYPE_EXTERNAL", "GUILD_SCHEDULED_EVENT_TYPE_NONE", "GUILD_SCHEDULED_EVENT_TYPE_STAGE_INSTANCE", "GUILD_SCHEDULED_EVENT_TYPE_VOICE", "MESSAGE_ACTIVITY_TYPE_JOIN", "MESSAGE_ACTIVITY_TYPE_LISTEN", "MESSAGE_ACTIVITY_TYPE_REQUEST", "MESSAGE_ACTIVITY_TYPE_SPECTATE", "MESSAGE_ACTIVITY_TYPE_WATCH", "MESSAGE_TYPE_USER_JOIN", "MSG_MUTE_MIN_COUNT", "RELATIONSHIP_TYPE_FRIEND", "RELATIONSHIP_TYPE_INVITE_INCOMING", "TRACKING_TYPE_FRIEND_REQUEST_REMINDER", "", "TRACKING_TYPE_GUILD_STREAM_START", "TRACKING_TYPE_HOME_LIFECYCLE_PUSH", "TRACKING_TYPE_MISSED_MESSAGE", "TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE", "TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH", "TRACKING_TYPE_SUSPICIOUS_SESSION", "TRACKING_TYPE_TOP_MESSAGES_PUSH", "TRACKING_TYPE_TRENDING_CONTENT_PUSH", "TYPE_ACTIVITY_START", "TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE", "TYPE_CALL_CONNECT", "TYPE_CALL_RING", "TYPE_CHANNEL_ACK", "TYPE_FORUM_THREAD_CREATED", "TYPE_FRIEND_SUGGESTION_CREATE", "TYPE_GENERIC_PUSH_NOTIFICATION_SENT", "TYPE_GUILD_SCHEDULED_EVENT_UPDATE", "TYPE_MESSAGE_CREATE", "TYPE_RELATIONSHIP_ADD", "TYPE_STAGE_INSTANCE_CREATE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationData;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationData> serializer() {
            return NotificationData$$serializer.INSTANCE;
        }
    }

    private NotificationData(int i10, int i11, String str, String str2, Integer num, String str3, Integer num2, String str4, Long l10, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, String str8, List<ChannelId> list, UserId userId, String str9, String str10, Integer num4, String str11, String str12, Integer num5, GuildId guildId, String str13, String str14, Integer num6, String str15, ApplicationId applicationId, String str16, String str17, NotificationMessage notificationMessage, String str18, Integer num7, boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25, SerializationConstructorMarker serializationConstructorMarker) {
        if ((1 != (i10 & 1)) || ((i11 & 0) != 0)) {
            n1.a(new int[]{i10, i11}, new int[]{1, 0}, NotificationData$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i10 & 2) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i10 & 4) == 0) {
            this.messageActivityType = null;
        } else {
            this.messageActivityType = num;
        }
        if ((i10 & 8) == 0) {
            this.messageApplicationName = null;
        } else {
            this.messageApplicationName = str3;
        }
        if ((i10 & 16) == 0) {
            this.messageType = null;
        } else {
            this.messageType = num2;
        }
        if ((i10 & 32) == 0) {
            this.messageContent = null;
        } else {
            this.messageContent = str4;
        }
        if ((i10 & 64) == 0) {
            this.messageFlags = null;
        } else {
            this.messageFlags = l10;
        }
        if ((i10 & 128) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num3;
        }
        if ((i10 & 256) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str5;
        }
        if ((i10 & 512) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i10 & 1024) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str6;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.parentName = null;
        } else {
            this.parentName = str7;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.parentId = null;
        } else {
            this.parentId = channelId2;
        }
        if ((i10 & 8192) == 0) {
            this.channelRtcRegion = null;
        } else {
            this.channelRtcRegion = str8;
        }
        this.ackChannelIds = (i10 & 16384) == 0 ? j.h() : list;
        if ((32768 & i10) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((65536 & i10) == 0) {
            this.userUsername = null;
        } else {
            this.userUsername = str9;
        }
        if ((131072 & i10) == 0) {
            this.userGlobalName = null;
        } else {
            this.userGlobalName = str10;
        }
        if ((262144 & i10) == 0) {
            this.userDiscriminator = null;
        } else {
            this.userDiscriminator = num4;
        }
        if ((524288 & i10) == 0) {
            this.userAvatar = null;
        } else {
            this.userAvatar = str11;
        }
        if ((1048576 & i10) == 0) {
            this.userGuildAvatar = null;
        } else {
            this.userGuildAvatar = str12;
        }
        if ((2097152 & i10) == 0) {
            this.relationshipType = null;
        } else {
            this.relationshipType = num5;
        }
        if ((4194304 & i10) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((8388608 & i10) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str13;
        }
        if ((16777216 & i10) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str14;
        }
        if ((33554432 & i10) == 0) {
            this.activityType = null;
        } else {
            this.activityType = num6;
        }
        if ((67108864 & i10) == 0) {
            this.activityName = null;
        } else {
            this.activityName = str15;
        }
        if ((134217728 & i10) == 0) {
            this.applicationId = null;
        } else {
            this.applicationId = applicationId;
        }
        if ((268435456 & i10) == 0) {
            this.applicationName = null;
        } else {
            this.applicationName = str16;
        }
        if ((536870912 & i10) == 0) {
            this.applicationIcon = null;
        } else {
            this.applicationIcon = str17;
        }
        if ((1073741824 & i10) == 0) {
            this.message = null;
        } else {
            this.message = notificationMessage;
        }
        if ((i10 & Integer.MIN_VALUE) == 0) {
            this.stageInstanceTopic = null;
        } else {
            this.stageInstanceTopic = str18;
        }
        if ((i11 & 1) == 0) {
            this.guildScheduledEventEntityType = null;
        } else {
            this.guildScheduledEventEntityType = num7;
        }
        if ((i11 & 2) == 0) {
            this.canReply = false;
        } else {
            this.canReply = z10;
        }
        if ((i11 & 4) == 0) {
            this.isFromCurrentUser = false;
        } else {
            this.isFromCurrentUser = z11;
        }
        if ((i11 & 8) == 0) {
            this.title = null;
        } else {
            this.title = str19;
        }
        if ((i11 & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str20;
        }
        if ((i11 & 32) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str21;
        }
        if ((i11 & 64) == 0) {
            this.notificationChannel = null;
        } else {
            this.notificationChannel = str22;
        }
        if ((i11 & 128) == 0) {
            this.trackingType = null;
        } else {
            this.trackingType = str23;
        }
        if ((i11 & 256) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str24;
        }
        this.expandSubtitle = (i11 & 512) == 0 ? Boolean.FALSE : bool;
        if ((i11 & 1024) == 0) {
            this.imageAttachmentUrl = null;
        } else {
            this.imageAttachmentUrl = str25;
        }
    }

    public  NotificationData(int i10, int i11, String str, String str2, Integer num, String str3, Integer num2, String str4, Long l10, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, String str8, @f(with = ChannelListSerializer.class) List list, UserId userId, String str9, String str10, Integer num4, String str11, String str12, Integer num5, GuildId guildId, String str13, String str14, Integer num6, String str15, ApplicationId applicationId, String str16, String str17, @f(with = NotificationMessageSerializer.class) NotificationMessage notificationMessage, String str18, Integer num7, @f(with = CanReplySerializer.class) boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str, str2, num, str3, num2, str4, l10, num3, str5, channelId, str6, str7, channelId2, str8, list, userId, str9, str10, num4, str11, str12, num5, guildId, str13, str14, num6, str15, applicationId, str16, str17, notificationMessage, str18, num7, z10, z11, str19, str20, str21, str22, str23, str24, bool, str25, serializationConstructorMarker);
    }

    public  NotificationData(String str, String str2, Integer num, String str3, Integer num2, String str4, Long l10, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, String str8, List list, UserId userId, String str9, String str10, Integer num4, String str11, String str12, Integer num5, GuildId guildId, String str13, String str14, Integer num6, String str15, ApplicationId applicationId, String str16, String str17, NotificationMessage notificationMessage, String str18, Integer num7, boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, num2, str4, l10, num3, str5, channelId, str6, str7, channelId2, str8, list, userId, str9, str10, num4, str11, str12, num5, guildId, str13, str14, num6, str15, applicationId, str16, str17, notificationMessage, str18, num7, z10, z11, str19, str20, str21, str22, str23, str24, bool, str25);
    }

    @f(with = ChannelListSerializer.class)
    public static  void getAckChannelIds$annotations() {
    }

    public static  void getActivityName$annotations() {
    }

    public static  void getActivityType$annotations() {
    }

    public static  void getApplicationIcon$annotations() {
    }

    
    public static  void m532getApplicationIdUtIrSio$annotations() {
    }

    public static  void getApplicationName$annotations() {
    }

    @f(with = CanReplySerializer.class)
    public static  void getCanReply$annotations() {
    }

    public static  void getChannelIcon$annotations() {
    }

    
    public static  void m533getChannelIdqMVnFVQ$annotations() {
    }

    public static  void getChannelName$annotations() {
    }

    public static  void getChannelRtcRegion$annotations() {
    }

    public static  void getChannelType$annotations() {
    }

    public static  void getDeeplink$annotations() {
    }

    public static  void getExpandSubtitle$annotations() {
    }

    public static  void getGuildIcon$annotations() {
    }

    
    public static  void m534getGuildIdqOKuAAo$annotations() {
    }

    public static  void getGuildName$annotations() {
    }

    public static  void getGuildScheduledEventEntityType$annotations() {
    }

    public static  void getIconUrl$annotations() {
    }

    public static  void getImageAttachmentUrl$annotations() {
    }

    @f(with = NotificationMessageSerializer.class)
    public static  void getMessage$annotations() {
    }

    public static  void getMessageActivityType$annotations() {
    }

    public static  void getMessageApplicationName$annotations() {
    }

    public static  void getMessageContent$annotations() {
    }

    public static  void getMessageFlags$annotations() {
    }

    
    public static  void m535getMessageIdN_6c4I0$annotations() {
    }

    public static  void getMessageType$annotations() {
    }

    public static  void getNotificationChannel$annotations() {
    }

    
    public static  void m536getParentIdqMVnFVQ$annotations() {
    }

    public static  void getParentName$annotations() {
    }

    public static  void getRelationshipType$annotations() {
    }

    public static  void getStageInstanceTopic$annotations() {
    }

    public static  void getSubtitle$annotations() {
    }

    public static  void getTitle$annotations() {
    }

    public static  void getTrackingType$annotations() {
    }

    public static  void getType$annotations() {
    }

    public static  void getUserAvatar$annotations() {
    }

    public static  void getUserDiscriminator$annotations() {
    }

    public static  void getUserGlobalName$annotations() {
    }

    public static  void getUserGuildAvatar$annotations() {
    }

    
    public static  void m537getUserIdwUX8bhU$annotations() {
    }

    public static  void getUserUsername$annotations() {
    }

    public static  void isFromCurrentUser$annotations() {
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static final void write$Self(com.discord.notifications.api.NotificationData r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.NotificationData.write$Self(com.discord.notifications.api.NotificationData, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.type;
    }

    
    public final ChannelId m538component10qMVnFVQ() {
        return this.channelId;
    }

    public final String component11() {
        return this.channelIcon;
    }

    public final String component12() {
        return this.parentName;
    }

    
    public final ChannelId m539component13qMVnFVQ() {
        return this.parentId;
    }

    public final String component14() {
        return this.channelRtcRegion;
    }

    public final List<ChannelId> component15() {
        return this.ackChannelIds;
    }

    
    public final UserId m540component16wUX8bhU() {
        return this.userId;
    }

    public final String component17() {
        return this.userUsername;
    }

    public final String component18() {
        return this.userGlobalName;
    }

    public final Integer component19() {
        return this.userDiscriminator;
    }

    
    public final String m541component2N_6c4I0() {
        return this.messageId;
    }

    public final String component20() {
        return this.userAvatar;
    }

    public final String component21() {
        return this.userGuildAvatar;
    }

    public final Integer component22() {
        return this.relationshipType;
    }

    
    public final GuildId m542component23qOKuAAo() {
        return this.guildId;
    }

    public final String component24() {
        return this.guildName;
    }

    public final String component25() {
        return this.guildIcon;
    }

    public final Integer component26() {
        return this.activityType;
    }

    public final String component27() {
        return this.activityName;
    }

    
    public final ApplicationId m543component28UtIrSio() {
        return this.applicationId;
    }

    public final String component29() {
        return this.applicationName;
    }

    public final Integer component3() {
        return this.messageActivityType;
    }

    public final String component30() {
        return this.applicationIcon;
    }

    public final NotificationMessage component31() {
        return this.message;
    }

    public final String component32() {
        return this.stageInstanceTopic;
    }

    public final Integer component33() {
        return this.guildScheduledEventEntityType;
    }

    public final boolean component34() {
        return this.canReply;
    }

    public final boolean component35() {
        return this.isFromCurrentUser;
    }

    public final String component36() {
        return this.title;
    }

    public final String component37() {
        return this.subtitle;
    }

    public final String component38() {
        return this.iconUrl;
    }

    public final String component39() {
        return this.notificationChannel;
    }

    public final String component4() {
        return this.messageApplicationName;
    }

    public final String component40() {
        return this.trackingType;
    }

    public final String component41() {
        return this.deeplink;
    }

    public final Boolean component42() {
        return this.expandSubtitle;
    }

    public final String component43() {
        return this.imageAttachmentUrl;
    }

    public final Integer component5() {
        return this.messageType;
    }

    public final String component6() {
        return this.messageContent;
    }

    public final Long component7() {
        return this.messageFlags;
    }

    public final Integer component8() {
        return this.channelType;
    }

    public final String component9() {
        return this.channelName;
    }

    
    public final NotificationData m544copyNwZg3Ig(String type, String str, Integer num, String str2, Integer num2, String str3, Long l10, Integer num3, String str4, ChannelId channelId, String str5, String str6, ChannelId channelId2, String str7, List<ChannelId> ackChannelIds, UserId userId, String str8, String str9, Integer num4, String str10, String str11, Integer num5, GuildId guildId, String str12, String str13, Integer num6, String str14, ApplicationId applicationId, String str15, String str16, NotificationMessage notificationMessage, String str17, Integer num7, boolean z10, boolean z11, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool, String str24) {
        q.h(type, "type");
        q.h(ackChannelIds, "ackChannelIds");
        return new NotificationData(type, str, num, str2, num2, str3, l10, num3, str4, channelId, str5, str6, channelId2, str7, ackChannelIds, userId, str8, str9, num4, str10, str11, num5, guildId, str12, str13, num6, str14, applicationId, str15, str16, notificationMessage, str17, num7, z10, z11, str18, str19, str20, str21, str22, str23, bool, str24, null);
    }

    
    
    
    public boolean equals(java.lang.Object r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.NotificationData.equals(java.lang.Object):boolean");
    }

    public final List<ChannelId> getAckChannelIds() {
        return this.ackChannelIds;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final Integer getActivityType() {
        return this.activityType;
    }

    public final String getApplicationIcon() {
        return this.applicationIcon;
    }

    
    public final ApplicationId m545getApplicationIdUtIrSio() {
        return this.applicationId;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final boolean getCanReply() {
        return this.canReply;
    }

    public final String getChannelIcon() {
        return this.channelIcon;
    }

    
    public final ChannelId m546getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getChannelRtcRegion() {
        return this.channelRtcRegion;
    }

    public final Integer getChannelType() {
        return this.channelType;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Boolean getExpandSubtitle() {
        return this.expandSubtitle;
    }

    public final String getGuildIcon() {
        return this.guildIcon;
    }

    
    public final GuildId m547getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    public final Integer getGuildScheduledEventEntityType() {
        return this.guildScheduledEventEntityType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getImageAttachmentUrl() {
        return this.imageAttachmentUrl;
    }

    public final NotificationMessage getMessage() {
        return this.message;
    }

    public final Integer getMessageActivityType() {
        return this.messageActivityType;
    }

    public final String getMessageApplicationName() {
        return this.messageApplicationName;
    }

    public final String getMessageContent() {
        return this.messageContent;
    }

    public final Long getMessageFlags() {
        return this.messageFlags;
    }

    
    public final String m548getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final Integer getMessageType() {
        return this.messageType;
    }

    public final String getNotificationChannel() {
        return this.notificationChannel;
    }

    
    public final ChannelId m549getParentIdqMVnFVQ() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final Integer getRelationshipType() {
        return this.relationshipType;
    }

    public final String getStageInstanceTopic() {
        return this.stageInstanceTopic;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingType() {
        return this.trackingType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserAvatar() {
        return this.userAvatar;
    }

    public final Integer getUserDiscriminator() {
        return this.userDiscriminator;
    }

    public final String getUserGlobalName() {
        return this.userGlobalName;
    }

    public final String getUserGuildAvatar() {
        return this.userGuildAvatar;
    }

    
    public final UserId m550getUserIdwUX8bhU() {
        return this.userId;
    }

    public final String getUserUsername() {
        return this.userUsername;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.messageId;
        int i10 = 0;
        int i11 = (hashCode + (str == null ? 0 : MessageId.m610hashCodeimpl(str))) * 31;
        Integer num = this.messageActivityType;
        int hashCode2 = (i11 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.messageApplicationName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.messageType;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.messageContent;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.messageFlags;
        int hashCode6 = (hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num3 = this.channelType;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.channelName;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ChannelId channelId = this.channelId;
        int i12 = (hashCode8 + (channelId == null ? 0 : ChannelId.m584hashCodeimpl(channelId.m588unboximpl()))) * 31;
        String str5 = this.channelIcon;
        int hashCode9 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.parentName;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ChannelId channelId2 = this.parentId;
        int i13 = (hashCode10 + (channelId2 == null ? 0 : ChannelId.m584hashCodeimpl(channelId2.m588unboximpl()))) * 31;
        String str7 = this.channelRtcRegion;
        int hashCode11 = (((i13 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.ackChannelIds.hashCode()) * 31;
        UserId userId = this.userId;
        int i14 = (hashCode11 + (userId == null ? 0 : UserId.m648hashCodeimpl(userId.m652unboximpl()))) * 31;
        String str8 = this.userUsername;
        int hashCode12 = (i14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userGlobalName;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num4 = this.userDiscriminator;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str10 = this.userAvatar;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userGuildAvatar;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.relationshipType;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        GuildId guildId = this.guildId;
        int i15 = (hashCode17 + (guildId == null ? 0 : GuildId.m597hashCodeimpl(guildId.m601unboximpl()))) * 31;
        String str12 = this.guildName;
        int hashCode18 = (i15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.guildIcon;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num6 = this.activityType;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str14 = this.activityName;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ApplicationId applicationId = this.applicationId;
        int i16 = (hashCode21 + (applicationId == null ? 0 : ApplicationId.m571hashCodeimpl(applicationId.m575unboximpl()))) * 31;
        String str15 = this.applicationName;
        int hashCode22 = (i16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.applicationIcon;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        NotificationMessage notificationMessage = this.message;
        int hashCode24 = (hashCode23 + (notificationMessage == null ? 0 : notificationMessage.hashCode())) * 31;
        String str17 = this.stageInstanceTopic;
        int hashCode25 = (hashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num7 = this.guildScheduledEventEntityType;
        int hashCode26 = (hashCode25 + (num7 == null ? 0 : num7.hashCode())) * 31;
        boolean z10 = this.canReply;
        int i17 = 1;
        if (z10) {
            z10 = true;
        }
        int i18 = z10 ? 1 : 0;
        int i19 = z10 ? 1 : 0;
        int i20 = z10 ? 1 : 0;
        int i21 = (hashCode26 + i18) * 31;
        boolean z11 = this.isFromCurrentUser;
        if (!z11) {
            i17 = z11 ? 1 : 0;
        }
        int i22 = (i21 + i17) * 31;
        String str18 = this.title;
        int hashCode27 = (i22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.subtitle;
        int hashCode28 = (hashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.iconUrl;
        int hashCode29 = (hashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.notificationChannel;
        int hashCode30 = (hashCode29 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.trackingType;
        int hashCode31 = (hashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.deeplink;
        int hashCode32 = (hashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool = this.expandSubtitle;
        int hashCode33 = (hashCode32 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str24 = this.imageAttachmentUrl;
        if (str24 != null) {
            i10 = str24.hashCode();
        }
        return hashCode33 + i10;
    }

    public final boolean isFromCurrentUser() {
        return this.isFromCurrentUser;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.messageId;
        String str3 = str2 == null ? "null" : MessageId.m611toStringimpl(str2);
        Integer num = this.messageActivityType;
        String str4 = this.messageApplicationName;
        Integer num2 = this.messageType;
        String str5 = this.messageContent;
        Long l10 = this.messageFlags;
        Integer num3 = this.channelType;
        String str6 = this.channelName;
        ChannelId channelId = this.channelId;
        String str7 = this.channelIcon;
        String str8 = this.parentName;
        ChannelId channelId2 = this.parentId;
        String str9 = this.channelRtcRegion;
        List<ChannelId> list = this.ackChannelIds;
        UserId userId = this.userId;
        String str10 = this.userUsername;
        String str11 = this.userGlobalName;
        Integer num4 = this.userDiscriminator;
        String str12 = this.userAvatar;
        String str13 = this.userGuildAvatar;
        Integer num5 = this.relationshipType;
        GuildId guildId = this.guildId;
        String str14 = this.guildName;
        String str15 = this.guildIcon;
        Integer num6 = this.activityType;
        String str16 = this.activityName;
        ApplicationId applicationId = this.applicationId;
        String str17 = this.applicationName;
        String str18 = this.applicationIcon;
        NotificationMessage notificationMessage = this.message;
        String str19 = this.stageInstanceTopic;
        Integer num7 = this.guildScheduledEventEntityType;
        boolean z10 = this.canReply;
        boolean z11 = this.isFromCurrentUser;
        String str20 = this.title;
        String str21 = this.subtitle;
        String str22 = this.iconUrl;
        String str23 = this.notificationChannel;
        String str24 = this.trackingType;
        String str25 = this.deeplink;
        Boolean bool = this.expandSubtitle;
        String str26 = this.imageAttachmentUrl;
        return "NotificationData(type=" + str + ", messageId=" + str3 + ", messageActivityType=" + num + ", messageApplicationName=" + str4 + ", messageType=" + num2 + ", messageContent=" + str5 + ", messageFlags=" + l10 + ", channelType=" + num3 + ", channelName=" + str6 + ", channelId=" + channelId + ", channelIcon=" + str7 + ", parentName=" + str8 + ", parentId=" + channelId2 + ", channelRtcRegion=" + str9 + ", ackChannelIds=" + list + ", userId=" + userId + ", userUsername=" + str10 + ", userGlobalName=" + str11 + ", userDiscriminator=" + num4 + ", userAvatar=" + str12 + ", userGuildAvatar=" + str13 + ", relationshipType=" + num5 + ", guildId=" + guildId + ", guildName=" + str14 + ", guildIcon=" + str15 + ", activityType=" + num6 + ", activityName=" + str16 + ", applicationId=" + applicationId + ", applicationName=" + str17 + ", applicationIcon=" + str18 + ", message=" + notificationMessage + ", stageInstanceTopic=" + str19 + ", guildScheduledEventEntityType=" + num7 + ", canReply=" + z10 + ", isFromCurrentUser=" + z11 + ", title=" + str20 + ", subtitle=" + str21 + ", iconUrl=" + str22 + ", notificationChannel=" + str23 + ", trackingType=" + str24 + ", deeplink=" + str25 + ", expandSubtitle=" + bool + ", imageAttachmentUrl=" + str26 + ")";
    }

    private NotificationData(String str, String str2, Integer num, String str3, Integer num2, String str4, Long l10, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, String str8, List<ChannelId> list, UserId userId, String str9, String str10, Integer num4, String str11, String str12, Integer num5, GuildId guildId, String str13, String str14, Integer num6, String str15, ApplicationId applicationId, String str16, String str17, NotificationMessage notificationMessage, String str18, Integer num7, boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25) {
        this.type = str;
        this.messageId = str2;
        this.messageActivityType = num;
        this.messageApplicationName = str3;
        this.messageType = num2;
        this.messageContent = str4;
        this.messageFlags = l10;
        this.channelType = num3;
        this.channelName = str5;
        this.channelId = channelId;
        this.channelIcon = str6;
        this.parentName = str7;
        this.parentId = channelId2;
        this.channelRtcRegion = str8;
        this.ackChannelIds = list;
        this.userId = userId;
        this.userUsername = str9;
        this.userGlobalName = str10;
        this.userDiscriminator = num4;
        this.userAvatar = str11;
        this.userGuildAvatar = str12;
        this.relationshipType = num5;
        this.guildId = guildId;
        this.guildName = str13;
        this.guildIcon = str14;
        this.activityType = num6;
        this.activityName = str15;
        this.applicationId = applicationId;
        this.applicationName = str16;
        this.applicationIcon = str17;
        this.message = notificationMessage;
        this.stageInstanceTopic = str18;
        this.guildScheduledEventEntityType = num7;
        this.canReply = z10;
        this.isFromCurrentUser = z11;
        this.title = str19;
        this.subtitle = str20;
        this.iconUrl = str21;
        this.notificationChannel = str22;
        this.trackingType = str23;
        this.deeplink = str24;
        this.expandSubtitle = bool;
        this.imageAttachmentUrl = str25;
    }

    public  NotificationData(String str, String str2, Integer num, String str3, Integer num2, String str4, Long l10, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, String str8, List list, UserId userId, String str9, String str10, Integer num4, String str11, String str12, Integer num5, GuildId guildId, String str13, String str14, Integer num6, String str15, ApplicationId applicationId, String str16, String str17, NotificationMessage notificationMessage, String str18, Integer num7, boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : l10, (i10 & 128) != 0 ? null : num3, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : channelId, (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : channelId2, (i10 & 8192) != 0 ? null : str8, (i10 & 16384) != 0 ? j.h() : list, (i10 & 32768) != 0 ? null : userId, (i10 & 65536) != 0 ? null : str9, (i10 & 131072) != 0 ? null : str10, (i10 & 262144) != 0 ? null : num4, (i10 & 524288) != 0 ? null : str11, (i10 & 1048576) != 0 ? null : str12, (i10 & 2097152) != 0 ? null : num5, (i10 & 4194304) != 0 ? null : guildId, (i10 & 8388608) != 0 ? null : str13, (i10 & 16777216) != 0 ? null : str14, (i10 & 33554432) != 0 ? null : num6, (i10 & 67108864) != 0 ? null : str15, (i10 & 134217728) != 0 ? null : applicationId, (i10 & 268435456) != 0 ? null : str16, (i10 & 536870912) != 0 ? null : str17, (i10 & 1073741824) != 0 ? null : notificationMessage, (i10 & Integer.MIN_VALUE) != 0 ? null : str18, (i11 & 1) != 0 ? null : num7, (i11 & 2) != 0 ? false : z10, (i11 & 4) == 0 ? z11 : false, (i11 & 8) != 0 ? null : str19, (i11 & 16) != 0 ? null : str20, (i11 & 32) != 0 ? null : str21, (i11 & 64) != 0 ? null : str22, (i11 & 128) != 0 ? null : str23, (i11 & 256) != 0 ? null : str24, (i11 & 512) != 0 ? Boolean.FALSE : bool, (i11 & 1024) != 0 ? null : str25, null);
    }
}
