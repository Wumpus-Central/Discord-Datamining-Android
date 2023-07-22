package com.discord.theme;

import android.content.Context;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\bá\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010á\u0003\u001a\u00020\u00062\u0007\u0010â\u0003\u001a\u00020\u00062\u0007\u0010ã\u0003\u001a\u00020\u0006H\u0016J\u001b\u0010ä\u0003\u001a\u00020\u00062\u0007\u0010å\u0003\u001a\u00020\u00062\u0007\u0010æ\u0003\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0014\u0010)\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0014\u0010+\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0014\u0010-\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0014\u0010/\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0014\u00101\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0014\u00103\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0014\u00107\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\bR\u0014\u0010;\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\bR\u0014\u0010?\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\bR\u0014\u0010A\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR\u0014\u0010I\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\bR\u0014\u0010K\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\bR\u0014\u0010M\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\bR\u0014\u0010O\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\bR\u0014\u0010S\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\bR\u0014\u0010U\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\bR\u0014\u0010W\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\bR\u0014\u0010Y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\bR\u0014\u0010[\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\bR\u0014\u0010]\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\bR\u0014\u0010_\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\bR\u0014\u0010a\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\bR\u0014\u0010c\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\bR\u0014\u0010e\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\bR\u0014\u0010g\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\bR\u0014\u0010i\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\bR\u0014\u0010k\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\bR\u0014\u0010m\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\bR\u0014\u0010o\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\bR\u0014\u0010q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\bR\u0014\u0010s\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\bR\u0014\u0010u\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\bR\u0014\u0010w\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\bR\u0014\u0010y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\bR\u0014\u0010{\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\bR\u0014\u0010}\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\bR\u0015\u0010\u007f\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0081\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\bR\u0016\u0010\u0085\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\bR\u0016\u0010\u0087\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010\bR\u0016\u0010\u0089\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\bR\u0016\u0010\u008b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010\bR\u0016\u0010\u008d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\bR\u0016\u0010\u008f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\bR\u0016\u0010\u0091\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010\bR\u0016\u0010\u0093\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\bR\u0016\u0010\u0095\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\bR\u0016\u0010\u0097\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010\bR\u0016\u0010\u0099\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010\bR\u0016\u0010\u009b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\bR\u0016\u0010\u009d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\bR\u0016\u0010\u009f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010\bR\u0016\u0010¡\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010\bR\u0016\u0010£\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010\bR\u0016\u0010¥\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\bR\u0016\u0010§\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010\bR\u0016\u0010©\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010\bR\u0016\u0010«\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010\bR\u0016\u0010\u00ad\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010\bR\u0016\u0010¯\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010\bR\u0016\u0010±\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010\bR\u0016\u0010³\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010\bR\u0016\u0010µ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010\bR\u0016\u0010·\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010\bR\u0016\u0010¹\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010\bR\u0016\u0010»\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010\bR\u0016\u0010½\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010\bR\u0016\u0010¿\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010\bR\u0016\u0010Á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010\bR\u0016\u0010Ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010\bR\u0016\u0010Å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010\bR\u0016\u0010Ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010\bR\u0016\u0010É\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010\bR\u0016\u0010Ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010\bR\u0016\u0010Í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010\bR\u0016\u0010Ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\bR\u0016\u0010Ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010\bR\u0016\u0010Ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010\bR\u0016\u0010Õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0001\u0010\bR\u0016\u0010×\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010\bR\u0016\u0010Ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0001\u0010\bR\u0016\u0010Û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010\bR\u0016\u0010Ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010\bR\u0016\u0010ß\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010\bR\u0016\u0010á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010\bR\u0016\u0010ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010\bR\u0016\u0010å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0001\u0010\bR\u0016\u0010ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010\bR\u0016\u0010é\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010\bR\u0016\u0010ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010\bR\u0016\u0010í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010\bR\u0016\u0010ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0001\u0010\bR\u0016\u0010ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0001\u0010\bR\u0016\u0010ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0001\u0010\bR\u0016\u0010õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010\bR\u0016\u0010÷\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0001\u0010\bR\u0016\u0010ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0001\u0010\bR\u0016\u0010û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0001\u0010\bR\u0016\u0010ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0001\u0010\bR\u0016\u0010ÿ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0002\u0010\bR\u0016\u0010\u0081\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0002\u0010\bR\u0016\u0010\u0083\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0002\u0010\bR\u0016\u0010\u0085\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0002\u0010\bR\u0016\u0010\u0087\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0002\u0010\bR\u0016\u0010\u0089\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0002\u0010\bR\u0016\u0010\u008b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0002\u0010\bR\u0016\u0010\u008d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0002\u0010\bR\u0016\u0010\u008f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0002\u0010\bR\u0016\u0010\u0091\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0002\u0010\bR\u0016\u0010\u0093\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0002\u0010\bR\u0016\u0010\u0095\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0002\u0010\bR\u0016\u0010\u0097\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0002\u0010\bR\u0016\u0010\u0099\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0002\u0010\bR\u0016\u0010\u009b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0002\u0010\bR\u0016\u0010\u009d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0002\u0010\bR\u0016\u0010\u009f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0002\u0010\bR\u0016\u0010¡\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0002\u0010\bR\u0016\u0010£\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0002\u0010\bR\u0016\u0010¥\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0002\u0010\bR\u0016\u0010§\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0002\u0010\bR\u0016\u0010©\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0002\u0010\bR\u0016\u0010«\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0002\u0010\bR\u0016\u0010\u00ad\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0002\u0010\bR\u0016\u0010¯\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0002\u0010\bR\u0016\u0010±\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0002\u0010\bR\u0016\u0010³\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0002\u0010\bR\u0016\u0010µ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0002\u0010\bR\u0016\u0010·\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0002\u0010\bR\u0016\u0010¹\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0002\u0010\bR\u0016\u0010»\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0002\u0010\bR\u0016\u0010½\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0002\u0010\bR\u0016\u0010¿\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0002\u0010\bR\u0016\u0010Á\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0002\u0010\bR\u0016\u0010Ã\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0002\u0010\bR\u0016\u0010Å\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0002\u0010\bR\u0016\u0010Ç\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0002\u0010\bR\u0016\u0010É\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0002\u0010\bR\u0016\u0010Ë\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0002\u0010\bR\u0016\u0010Í\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0002\u0010\bR\u0016\u0010Ï\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0002\u0010\bR\u0016\u0010Ñ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0002\u0010\bR\u0016\u0010Ó\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0002\u0010\bR\u0016\u0010Õ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0002\u0010\bR\u0016\u0010×\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0002\u0010\bR\u0016\u0010Ù\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0002\u0010\bR\u0016\u0010Û\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0002\u0010\bR\u0016\u0010Ý\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0002\u0010\bR\u0016\u0010ß\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0002\u0010\bR\u0016\u0010á\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0002\u0010\bR\u0016\u0010ã\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0002\u0010\bR\u0016\u0010å\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0002\u0010\bR\u0016\u0010ç\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0002\u0010\bR\u0016\u0010é\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0002\u0010\bR\u0016\u0010ë\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0002\u0010\bR\u0016\u0010í\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0002\u0010\bR\u0016\u0010ï\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0002\u0010\bR\u0016\u0010ñ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0002\u0010\bR\u0016\u0010ó\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0002\u0010\bR\u0016\u0010õ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0002\u0010\bR\u0016\u0010÷\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0002\u0010\bR\u0016\u0010ù\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0002\u0010\bR\u0016\u0010û\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0002\u0010\bR\u0016\u0010ý\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0002\u0010\bR\u0016\u0010ÿ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0003\u0010\bR\u0016\u0010\u0081\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0003\u0010\bR\u0016\u0010\u0083\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0003\u0010\bR\u0016\u0010\u0085\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0003\u0010\bR\u0016\u0010\u0087\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0003\u0010\bR\u0016\u0010\u0089\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0003\u0010\bR\u0016\u0010\u008b\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0003\u0010\bR\u0016\u0010\u008d\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0003\u0010\bR\u0016\u0010\u008f\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0003\u0010\bR\u0016\u0010\u0091\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0003\u0010\bR\u0016\u0010\u0093\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0003\u0010\bR\u0016\u0010\u0095\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0003\u0010\bR\u0016\u0010\u0097\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0003\u0010\bR\u0016\u0010\u0099\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0003\u0010\bR\u0016\u0010\u009b\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0003\u0010\bR\u0016\u0010\u009d\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0003\u0010\bR\u0016\u0010\u009f\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0003\u0010\bR\u0016\u0010¡\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0003\u0010\bR\u0016\u0010£\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0003\u0010\bR\u0016\u0010¥\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0003\u0010\bR\u0016\u0010§\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0003\u0010\bR\u0016\u0010©\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0003\u0010\bR\u0016\u0010«\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0003\u0010\bR\u0016\u0010\u00ad\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0003\u0010\bR\u0016\u0010¯\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0003\u0010\bR\u0016\u0010±\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0003\u0010\bR\u0016\u0010³\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0003\u0010\bR\u0016\u0010µ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0003\u0010\bR\u0016\u0010·\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0003\u0010\bR\u0016\u0010¹\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0003\u0010\bR\u0016\u0010»\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0003\u0010\bR\u0016\u0010½\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0003\u0010\bR\u0016\u0010¿\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0003\u0010\bR\u0016\u0010Á\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0003\u0010\bR\u0016\u0010Ã\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0003\u0010\bR\u0016\u0010Å\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0003\u0010\bR\u0016\u0010Ç\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0003\u0010\bR\u0016\u0010É\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0003\u0010\bR\u0016\u0010Ë\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0003\u0010\bR\u0016\u0010Í\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0003\u0010\bR\u0016\u0010Ï\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0003\u0010\bR\u0016\u0010Ñ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0003\u0010\bR\u0016\u0010Ó\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0003\u0010\bR\u0016\u0010Õ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0003\u0010\bR\u0016\u0010×\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0003\u0010\bR\u0016\u0010Ù\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0003\u0010\bR\u0016\u0010Û\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0003\u0010\bR\u0016\u0010Ý\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0003\u0010\bR\u0016\u0010ß\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0003\u0010\b¨\u0006ç\u0003"}, d2 = {"Lcom/discord/theme/LightTheme;", "Lcom/discord/theme/DiscordTheme;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activityCardBackground", "", "getActivityCardBackground", "()I", "androidNavigationBarBackground", "getAndroidNavigationBarBackground", "androidNavigationScrimBackground", "getAndroidNavigationScrimBackground", "androidRipple", "getAndroidRipple", "backgroundAccent", "getBackgroundAccent", "backgroundFloating", "getBackgroundFloating", "backgroundMentioned", "getBackgroundMentioned", "backgroundMentionedHover", "getBackgroundMentionedHover", "backgroundMessageAutomod", "getBackgroundMessageAutomod", "backgroundMessageAutomodHover", "getBackgroundMessageAutomodHover", "backgroundMessageHighlight", "getBackgroundMessageHighlight", "backgroundMessageHighlightHover", "getBackgroundMessageHighlightHover", "backgroundMessageHover", "getBackgroundMessageHover", "backgroundMobilePrimary", "getBackgroundMobilePrimary", "backgroundMobileSecondary", "getBackgroundMobileSecondary", "backgroundModifierAccent", "getBackgroundModifierAccent", "backgroundModifierAccent2", "getBackgroundModifierAccent2", "backgroundModifierActive", "getBackgroundModifierActive", "backgroundModifierHover", "getBackgroundModifierHover", "backgroundModifierSelected", "getBackgroundModifierSelected", "backgroundNestedFloating", "getBackgroundNestedFloating", "backgroundPrimary", "getBackgroundPrimary", "backgroundSecondary", "getBackgroundSecondary", "backgroundSecondaryAlt", "getBackgroundSecondaryAlt", "backgroundTertiary", "getBackgroundTertiary", "black", "getBlack", "borderStrong", "getBorderStrong", "borderSubtle", "getBorderSubtle", "bugReporterModalSubmittingBackground", "getBugReporterModalSubmittingBackground", "buttonCreatorRevenueBackground", "getButtonCreatorRevenueBackground", "buttonDangerBackground", "getButtonDangerBackground", "buttonDangerBackgroundActive", "getButtonDangerBackgroundActive", "buttonDangerBackgroundDisabled", "getButtonDangerBackgroundDisabled", "buttonDangerBackgroundHover", "getButtonDangerBackgroundHover", "buttonOutlineBrandBackground", "getButtonOutlineBrandBackground", "buttonOutlineBrandBackgroundActive", "getButtonOutlineBrandBackgroundActive", "buttonOutlineBrandBackgroundHover", "getButtonOutlineBrandBackgroundHover", "buttonOutlineBrandBorder", "getButtonOutlineBrandBorder", "buttonOutlineBrandBorderActive", "getButtonOutlineBrandBorderActive", "buttonOutlineBrandBorderHover", "getButtonOutlineBrandBorderHover", "buttonOutlineBrandText", "getButtonOutlineBrandText", "buttonOutlineBrandTextActive", "getButtonOutlineBrandTextActive", "buttonOutlineBrandTextHover", "getButtonOutlineBrandTextHover", "buttonOutlineDangerBackground", "getButtonOutlineDangerBackground", "buttonOutlineDangerBackgroundActive", "getButtonOutlineDangerBackgroundActive", "buttonOutlineDangerBackgroundHover", "getButtonOutlineDangerBackgroundHover", "buttonOutlineDangerBorder", "getButtonOutlineDangerBorder", "buttonOutlineDangerBorderActive", "getButtonOutlineDangerBorderActive", "buttonOutlineDangerBorderHover", "getButtonOutlineDangerBorderHover", "buttonOutlineDangerText", "getButtonOutlineDangerText", "buttonOutlineDangerTextActive", "getButtonOutlineDangerTextActive", "buttonOutlineDangerTextHover", "getButtonOutlineDangerTextHover", "buttonOutlinePositiveBackground", "getButtonOutlinePositiveBackground", "buttonOutlinePositiveBackgroundActive", "getButtonOutlinePositiveBackgroundActive", "buttonOutlinePositiveBackgroundHover", "getButtonOutlinePositiveBackgroundHover", "buttonOutlinePositiveBorder", "getButtonOutlinePositiveBorder", "buttonOutlinePositiveBorderActive", "getButtonOutlinePositiveBorderActive", "buttonOutlinePositiveBorderHover", "getButtonOutlinePositiveBorderHover", "buttonOutlinePositiveText", "getButtonOutlinePositiveText", "buttonOutlinePositiveTextActive", "getButtonOutlinePositiveTextActive", "buttonOutlinePositiveTextHover", "getButtonOutlinePositiveTextHover", "buttonOutlinePrimaryBackground", "getButtonOutlinePrimaryBackground", "buttonOutlinePrimaryBackgroundActive", "getButtonOutlinePrimaryBackgroundActive", "buttonOutlinePrimaryBackgroundHover", "getButtonOutlinePrimaryBackgroundHover", "buttonOutlinePrimaryBorder", "getButtonOutlinePrimaryBorder", "buttonOutlinePrimaryBorderActive", "getButtonOutlinePrimaryBorderActive", "buttonOutlinePrimaryBorderHover", "getButtonOutlinePrimaryBorderHover", "buttonOutlinePrimaryText", "getButtonOutlinePrimaryText", "buttonOutlinePrimaryTextActive", "getButtonOutlinePrimaryTextActive", "buttonOutlinePrimaryTextHover", "getButtonOutlinePrimaryTextHover", "buttonPositiveBackground", "getButtonPositiveBackground", "buttonPositiveBackgroundActive", "getButtonPositiveBackgroundActive", "buttonPositiveBackgroundDisabled", "getButtonPositiveBackgroundDisabled", "buttonPositiveBackgroundHover", "getButtonPositiveBackgroundHover", "buttonSecondaryBackground", "getButtonSecondaryBackground", "buttonSecondaryBackgroundActive", "getButtonSecondaryBackgroundActive", "buttonSecondaryBackgroundDisabled", "getButtonSecondaryBackgroundDisabled", "buttonSecondaryBackgroundHover", "getButtonSecondaryBackgroundHover", "channelIcon", "getChannelIcon", "channelTextAreaPlaceholder", "getChannelTextAreaPlaceholder", "channelsDefault", "getChannelsDefault", "channeltextareaBackground", "getChanneltextareaBackground", "chatBackground", "getChatBackground", "chatBorder", "getChatBorder", "chatInputContainerBackground", "getChatInputContainerBackground", "controlBrandForeground", "getControlBrandForeground", "controlBrandForegroundNew", "getControlBrandForegroundNew", "creatorRevenueIconGradientEnd", "getCreatorRevenueIconGradientEnd", "creatorRevenueIconGradientStart", "getCreatorRevenueIconGradientStart", "creatorRevenueInfoBoxBackground", "getCreatorRevenueInfoBoxBackground", "creatorRevenueInfoBoxBorder", "getCreatorRevenueInfoBoxBorder", "creatorRevenueLockedChannelIcon", "getCreatorRevenueLockedChannelIcon", "creatorRevenueProgressBar", "getCreatorRevenueProgressBar", "deprecatedCardBg", "getDeprecatedCardBg", "deprecatedCardEditableBg", "getDeprecatedCardEditableBg", "deprecatedQuickswitcherInputBackground", "getDeprecatedQuickswitcherInputBackground", "deprecatedQuickswitcherInputPlaceholder", "getDeprecatedQuickswitcherInputPlaceholder", "deprecatedStoreBg", "getDeprecatedStoreBg", "deprecatedTextInputBg", "getDeprecatedTextInputBg", "deprecatedTextInputBorder", "getDeprecatedTextInputBorder", "deprecatedTextInputBorderDisabled", "getDeprecatedTextInputBorderDisabled", "deprecatedTextInputBorderHover", "getDeprecatedTextInputBorderHover", "deprecatedTextInputPrefix", "getDeprecatedTextInputPrefix", "displayBannerOverflowBackground", "getDisplayBannerOverflowBackground", "dividerStrong", "getDividerStrong", "dividerSubtle", "getDividerSubtle", "focusPrimary", "getFocusPrimary", "forumPostExtraMediaCountContainerBackground", "getForumPostExtraMediaCountContainerBackground", "forumPostTagBackground", "getForumPostTagBackground", "headerMuted", "getHeaderMuted", "headerPrimary", "getHeaderPrimary", "headerSecondary", "getHeaderSecondary", "homeBackground", "getHomeBackground", "homeCardRestingBorder", "getHomeCardRestingBorder", "iconMuted", "getIconMuted", "iconPrimary", "getIconPrimary", "iconSecondary", "getIconSecondary", "infoBoxBackground", "getInfoBoxBackground", "infoDangerBackground", "getInfoDangerBackground", "infoDangerForeground", "getInfoDangerForeground", "infoDangerText", "getInfoDangerText", "infoHelpBackground", "getInfoHelpBackground", "infoHelpForeground", "getInfoHelpForeground", "infoHelpText", "getInfoHelpText", "infoPositiveBackground", "getInfoPositiveBackground", "infoPositiveForeground", "getInfoPositiveForeground", "infoPositiveText", "getInfoPositiveText", "infoWarningBackground", "getInfoWarningBackground", "infoWarningForeground", "getInfoWarningForeground", "infoWarningText", "getInfoWarningText", "inputBackground", "getInputBackground", "inputPlaceholderText", "getInputPlaceholderText", "interactiveActive", "getInteractiveActive", "interactiveHover", "getInteractiveHover", "interactiveMuted", "getInteractiveMuted", "interactiveNormal", "getInteractiveNormal", "liveStageTileBorder", "getLiveStageTileBorder", "logoPrimary", "getLogoPrimary", "mentionBackground", "getMentionBackground", "mentionForeground", "getMentionForeground", "modalBackground", "getModalBackground", "modalFooterBackground", "getModalFooterBackground", "profileGradientMessageInputBorder", "getProfileGradientMessageInputBorder", "profileGradientNoteBackground", "getProfileGradientNoteBackground", "profileGradientOverlay", "getProfileGradientOverlay", "profileGradientOverlaySyncedWithUserTheme", "getProfileGradientOverlaySyncedWithUserTheme", "profileGradientProfileBodyBackgroundHover", "getProfileGradientProfileBodyBackgroundHover", "profileGradientRolePillBackground", "getProfileGradientRolePillBackground", "profileGradientRolePillBorder", "getProfileGradientRolePillBorder", "profileGradientSectionBox", "getProfileGradientSectionBox", "redesignActivityCardBackground", "getRedesignActivityCardBackground", "redesignActivityCardBackgroundPressed", "getRedesignActivityCardBackgroundPressed", "redesignActivityCardBadgeIcon", "getRedesignActivityCardBadgeIcon", "redesignActivityCardBorder", "getRedesignActivityCardBorder", "redesignActivityCardOverflowBackground", "getRedesignActivityCardOverflowBackground", "redesignButtonDangerBackground", "getRedesignButtonDangerBackground", "redesignButtonDangerPressedBackground", "getRedesignButtonDangerPressedBackground", "redesignButtonDangerText", "getRedesignButtonDangerText", "redesignButtonOverlayAlphaBackground", "getRedesignButtonOverlayAlphaBackground", "redesignButtonOverlayAlphaPressedBackground", "getRedesignButtonOverlayAlphaPressedBackground", "redesignButtonOverlayAlphaText", "getRedesignButtonOverlayAlphaText", "redesignButtonOverlayBackground", "getRedesignButtonOverlayBackground", "redesignButtonOverlayPressedBackground", "getRedesignButtonOverlayPressedBackground", "redesignButtonOverlayText", "getRedesignButtonOverlayText", "redesignButtonPositiveBackground", "getRedesignButtonPositiveBackground", "redesignButtonPositivePressedBackground", "getRedesignButtonPositivePressedBackground", "redesignButtonPositiveText", "getRedesignButtonPositiveText", "redesignButtonPrimaryAltBackground", "getRedesignButtonPrimaryAltBackground", "redesignButtonPrimaryAltBorder", "getRedesignButtonPrimaryAltBorder", "redesignButtonPrimaryAltOnBlurpleBackground", "getRedesignButtonPrimaryAltOnBlurpleBackground", "redesignButtonPrimaryAltOnBlurpleBorder", "getRedesignButtonPrimaryAltOnBlurpleBorder", "redesignButtonPrimaryAltOnBlurplePressedBackground", "getRedesignButtonPrimaryAltOnBlurplePressedBackground", "redesignButtonPrimaryAltOnBlurplePressedBorder", "getRedesignButtonPrimaryAltOnBlurplePressedBorder", "redesignButtonPrimaryAltOnBlurpleText", "getRedesignButtonPrimaryAltOnBlurpleText", "redesignButtonPrimaryAltPressedBackground", "getRedesignButtonPrimaryAltPressedBackground", "redesignButtonPrimaryAltPressedBorder", "getRedesignButtonPrimaryAltPressedBorder", "redesignButtonPrimaryAltPressedText", "getRedesignButtonPrimaryAltPressedText", "redesignButtonPrimaryAltText", "getRedesignButtonPrimaryAltText", "redesignButtonPrimaryBackground", "getRedesignButtonPrimaryBackground", "redesignButtonPrimaryOnBlurpleBackground", "getRedesignButtonPrimaryOnBlurpleBackground", "redesignButtonPrimaryOnBlurplePressedBackground", "getRedesignButtonPrimaryOnBlurplePressedBackground", "redesignButtonPrimaryOnBlurplePressedText", "getRedesignButtonPrimaryOnBlurplePressedText", "redesignButtonPrimaryOnBlurpleText", "getRedesignButtonPrimaryOnBlurpleText", "redesignButtonPrimaryPressedBackground", "getRedesignButtonPrimaryPressedBackground", "redesignButtonPrimaryText", "getRedesignButtonPrimaryText", "redesignButtonSecondaryAltBackground", "getRedesignButtonSecondaryAltBackground", "redesignButtonSecondaryAltPressedBackground", "getRedesignButtonSecondaryAltPressedBackground", "redesignButtonSecondaryAltPressedText", "getRedesignButtonSecondaryAltPressedText", "redesignButtonSecondaryAltText", "getRedesignButtonSecondaryAltText", "redesignButtonSecondaryBackground", "getRedesignButtonSecondaryBackground", "redesignButtonSecondaryBorder", "getRedesignButtonSecondaryBorder", "redesignButtonSecondaryPressedBackground", "getRedesignButtonSecondaryPressedBackground", "redesignButtonSecondaryPressedBorder", "getRedesignButtonSecondaryPressedBorder", "redesignButtonSecondaryText", "getRedesignButtonSecondaryText", "redesignInputControlSelected", "getRedesignInputControlSelected", "redesignOnlyBackgroundActive", "getRedesignOnlyBackgroundActive", "redesignOnlyBackgroundDefault", "getRedesignOnlyBackgroundDefault", "redesignOnlyBackgroundOverlay", "getRedesignOnlyBackgroundOverlay", "redesignOnlyBackgroundRaised", "getRedesignOnlyBackgroundRaised", "redesignOnlyBackgroundSunken", "getRedesignOnlyBackgroundSunken", "scrollbarAutoScrollbarColorThumb", "getScrollbarAutoScrollbarColorThumb", "scrollbarAutoScrollbarColorTrack", "getScrollbarAutoScrollbarColorTrack", "scrollbarAutoThumb", "getScrollbarAutoThumb", "scrollbarAutoTrack", "getScrollbarAutoTrack", "scrollbarThinThumb", "getScrollbarThinThumb", "scrollbarThinTrack", "getScrollbarThinTrack", "spoilerHiddenBackground", "getSpoilerHiddenBackground", "spoilerRevealedBackground", "getSpoilerRevealedBackground", "statusDanger", "getStatusDanger", "statusDangerBackground", "getStatusDangerBackground", "statusDangerText", "getStatusDangerText", "statusDnd", "getStatusDnd", "statusIdle", "getStatusIdle", "statusOffline", "getStatusOffline", "statusOnline", "getStatusOnline", "statusPositive", "getStatusPositive", "statusPositiveBackground", "getStatusPositiveBackground", "statusPositiveText", "getStatusPositiveText", "statusWarning", "getStatusWarning", "statusWarningBackground", "getStatusWarningBackground", "statusWarningText", "getStatusWarningText", "textBrand", "getTextBrand", "textDanger", "getTextDanger", "textLink", "getTextLink", "textLinkLowSaturation", "getTextLinkLowSaturation", "textLowContrast", "getTextLowContrast", "textMessagePreviewLowSat", "getTextMessagePreviewLowSat", "textMuted", "getTextMuted", "textMutedOnDefault", "getTextMutedOnDefault", "textNormal", "getTextNormal", "textPositive", "getTextPositive", "textPrimary", "getTextPrimary", "textSecondary", "getTextSecondary", "textWarning", "getTextWarning", "textboxMarkdownSyntax", "getTextboxMarkdownSyntax", "userProfileHeaderOverflowBackground", "getUserProfileHeaderOverflowBackground", "white", "getWhite", "getColor", "lightColor", "darkColor", "getColorRes", "lightColorRes", "darkColorRes", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LightTheme extends DiscordTheme {
    private final int activityCardBackground;
    private final int androidNavigationBarBackground;
    private final int androidNavigationScrimBackground;
    private final int androidRipple;
    private final int backgroundAccent;
    private final int backgroundFloating;
    private final int backgroundMentioned;
    private final int backgroundMentionedHover;
    private final int backgroundMessageAutomod;
    private final int backgroundMessageAutomodHover;
    private final int backgroundMessageHighlight;
    private final int backgroundMessageHighlightHover;
    private final int backgroundMessageHover;
    private final int backgroundMobilePrimary;
    private final int backgroundMobileSecondary;
    private final int backgroundModifierAccent;
    private final int backgroundModifierAccent2;
    private final int backgroundModifierActive;
    private final int backgroundModifierHover;
    private final int backgroundModifierSelected;
    private final int backgroundNestedFloating;
    private final int backgroundPrimary;
    private final int backgroundSecondary;
    private final int backgroundSecondaryAlt;
    private final int backgroundTertiary;
    private final int black;
    private final int borderStrong;
    private final int borderSubtle;
    private final int bugReporterModalSubmittingBackground;
    private final int buttonCreatorRevenueBackground;
    private final int buttonDangerBackground;
    private final int buttonDangerBackgroundActive;
    private final int buttonDangerBackgroundDisabled;
    private final int buttonDangerBackgroundHover;
    private final int buttonOutlineBrandBackground;
    private final int buttonOutlineBrandBackgroundActive;
    private final int buttonOutlineBrandBackgroundHover;
    private final int buttonOutlineBrandBorder;
    private final int buttonOutlineBrandBorderActive;
    private final int buttonOutlineBrandBorderHover;
    private final int buttonOutlineBrandText;
    private final int buttonOutlineBrandTextActive;
    private final int buttonOutlineBrandTextHover;
    private final int buttonOutlineDangerBackground;
    private final int buttonOutlineDangerBackgroundActive;
    private final int buttonOutlineDangerBackgroundHover;
    private final int buttonOutlineDangerBorder;
    private final int buttonOutlineDangerBorderActive;
    private final int buttonOutlineDangerBorderHover;
    private final int buttonOutlineDangerText;
    private final int buttonOutlineDangerTextActive;
    private final int buttonOutlineDangerTextHover;
    private final int buttonOutlinePositiveBackground;
    private final int buttonOutlinePositiveBackgroundActive;
    private final int buttonOutlinePositiveBackgroundHover;
    private final int buttonOutlinePositiveBorder;
    private final int buttonOutlinePositiveBorderActive;
    private final int buttonOutlinePositiveBorderHover;
    private final int buttonOutlinePositiveText;
    private final int buttonOutlinePositiveTextActive;
    private final int buttonOutlinePositiveTextHover;
    private final int buttonOutlinePrimaryBackground;
    private final int buttonOutlinePrimaryBackgroundActive;
    private final int buttonOutlinePrimaryBackgroundHover;
    private final int buttonOutlinePrimaryBorder;
    private final int buttonOutlinePrimaryBorderActive;
    private final int buttonOutlinePrimaryBorderHover;
    private final int buttonOutlinePrimaryText;
    private final int buttonOutlinePrimaryTextActive;
    private final int buttonOutlinePrimaryTextHover;
    private final int buttonPositiveBackground;
    private final int buttonPositiveBackgroundActive;
    private final int buttonPositiveBackgroundDisabled;
    private final int buttonPositiveBackgroundHover;
    private final int buttonSecondaryBackground;
    private final int buttonSecondaryBackgroundActive;
    private final int buttonSecondaryBackgroundDisabled;
    private final int buttonSecondaryBackgroundHover;
    private final int channelIcon;
    private final int channelTextAreaPlaceholder;
    private final int channelsDefault;
    private final int channeltextareaBackground;
    private final int chatBackground;
    private final int chatBorder;
    private final int chatInputContainerBackground;
    private final int controlBrandForeground;
    private final int controlBrandForegroundNew;
    private final int creatorRevenueIconGradientEnd;
    private final int creatorRevenueIconGradientStart;
    private final int creatorRevenueInfoBoxBackground;
    private final int creatorRevenueInfoBoxBorder;
    private final int creatorRevenueLockedChannelIcon;
    private final int creatorRevenueProgressBar;
    private final int deprecatedCardBg;
    private final int deprecatedCardEditableBg;
    private final int deprecatedQuickswitcherInputBackground;
    private final int deprecatedQuickswitcherInputPlaceholder;
    private final int deprecatedStoreBg;
    private final int deprecatedTextInputBg;
    private final int deprecatedTextInputBorder;
    private final int deprecatedTextInputBorderDisabled;
    private final int deprecatedTextInputBorderHover;
    private final int deprecatedTextInputPrefix;
    private final int displayBannerOverflowBackground;
    private final int dividerStrong;
    private final int dividerSubtle;
    private final int focusPrimary;
    private final int forumPostExtraMediaCountContainerBackground;
    private final int forumPostTagBackground;
    private final int headerMuted;
    private final int headerPrimary;
    private final int headerSecondary;
    private final int homeBackground;
    private final int homeCardRestingBorder;
    private final int iconMuted;
    private final int iconPrimary;
    private final int iconSecondary;
    private final int infoBoxBackground;
    private final int infoDangerBackground;
    private final int infoDangerForeground;
    private final int infoDangerText;
    private final int infoHelpBackground;
    private final int infoHelpForeground;
    private final int infoHelpText;
    private final int infoPositiveBackground;
    private final int infoPositiveForeground;
    private final int infoPositiveText;
    private final int infoWarningBackground;
    private final int infoWarningForeground;
    private final int infoWarningText;
    private final int inputBackground;
    private final int inputPlaceholderText;
    private final int interactiveActive;
    private final int interactiveHover;
    private final int interactiveMuted;
    private final int interactiveNormal;
    private final int liveStageTileBorder;
    private final int logoPrimary;
    private final int mentionBackground;
    private final int mentionForeground;
    private final int modalBackground;
    private final int modalFooterBackground;
    private final int profileGradientMessageInputBorder;
    private final int profileGradientNoteBackground;
    private final int profileGradientOverlay;
    private final int profileGradientOverlaySyncedWithUserTheme;
    private final int profileGradientProfileBodyBackgroundHover;
    private final int profileGradientRolePillBackground;
    private final int profileGradientRolePillBorder;
    private final int profileGradientSectionBox;
    private final int redesignActivityCardBackground;
    private final int redesignActivityCardBackgroundPressed;
    private final int redesignActivityCardBadgeIcon;
    private final int redesignActivityCardBorder;
    private final int redesignActivityCardOverflowBackground;
    private final int redesignButtonDangerBackground;
    private final int redesignButtonDangerPressedBackground;
    private final int redesignButtonDangerText;
    private final int redesignButtonOverlayAlphaBackground;
    private final int redesignButtonOverlayAlphaPressedBackground;
    private final int redesignButtonOverlayAlphaText;
    private final int redesignButtonOverlayBackground;
    private final int redesignButtonOverlayPressedBackground;
    private final int redesignButtonOverlayText;
    private final int redesignButtonPositiveBackground;
    private final int redesignButtonPositivePressedBackground;
    private final int redesignButtonPositiveText;
    private final int redesignButtonPrimaryAltBackground;
    private final int redesignButtonPrimaryAltBorder;
    private final int redesignButtonPrimaryAltOnBlurpleBackground;
    private final int redesignButtonPrimaryAltOnBlurpleBorder;
    private final int redesignButtonPrimaryAltOnBlurplePressedBackground;
    private final int redesignButtonPrimaryAltOnBlurplePressedBorder;
    private final int redesignButtonPrimaryAltOnBlurpleText;
    private final int redesignButtonPrimaryAltPressedBackground;
    private final int redesignButtonPrimaryAltPressedBorder;
    private final int redesignButtonPrimaryAltPressedText;
    private final int redesignButtonPrimaryAltText;
    private final int redesignButtonPrimaryBackground;
    private final int redesignButtonPrimaryOnBlurpleBackground;
    private final int redesignButtonPrimaryOnBlurplePressedBackground;
    private final int redesignButtonPrimaryOnBlurplePressedText;
    private final int redesignButtonPrimaryOnBlurpleText;
    private final int redesignButtonPrimaryPressedBackground;
    private final int redesignButtonPrimaryText;
    private final int redesignButtonSecondaryAltBackground;
    private final int redesignButtonSecondaryAltPressedBackground;
    private final int redesignButtonSecondaryAltPressedText;
    private final int redesignButtonSecondaryAltText;
    private final int redesignButtonSecondaryBackground;
    private final int redesignButtonSecondaryBorder;
    private final int redesignButtonSecondaryPressedBackground;
    private final int redesignButtonSecondaryPressedBorder;
    private final int redesignButtonSecondaryText;
    private final int redesignInputControlSelected;
    private final int redesignOnlyBackgroundActive;
    private final int redesignOnlyBackgroundDefault;
    private final int redesignOnlyBackgroundOverlay;
    private final int redesignOnlyBackgroundRaised;
    private final int redesignOnlyBackgroundSunken;
    private final int scrollbarAutoScrollbarColorThumb;
    private final int scrollbarAutoScrollbarColorTrack;
    private final int scrollbarAutoThumb;
    private final int scrollbarAutoTrack;
    private final int scrollbarThinThumb;
    private final int scrollbarThinTrack;
    private final int spoilerHiddenBackground;
    private final int spoilerRevealedBackground;
    private final int statusDanger;
    private final int statusDangerBackground;
    private final int statusDangerText;
    private final int statusDnd;
    private final int statusIdle;
    private final int statusOffline;
    private final int statusOnline;
    private final int statusPositive;
    private final int statusPositiveBackground;
    private final int statusPositiveText;
    private final int statusWarning;
    private final int statusWarningBackground;
    private final int statusWarningText;
    private final int textBrand;
    private final int textDanger;
    private final int textLink;
    private final int textLinkLowSaturation;
    private final int textLowContrast;
    private final int textMessagePreviewLowSat;
    private final int textMuted;
    private final int textMutedOnDefault;
    private final int textNormal;
    private final int textPositive;
    private final int textPrimary;
    private final int textSecondary;
    private final int textWarning;
    private final int textboxMarkdownSyntax;
    private final int userProfileHeaderOverflowBackground;
    private final int white;

    
    public LightTheme(Context context) {
        super(null);
        q.g(context, "context");
        int i10 = R.color.white_500;
        this.activityCardBackground = ColorUtilsKt.getColorCompat(context, i10);
        int i11 = R.color.primary_100;
        this.androidNavigationBarBackground = ColorUtilsKt.getColorCompat(context, i11);
        this.androidNavigationScrimBackground = ColorUtilsKt.getColorCompat(context, R.color.android_navigation_scrim_background_light);
        this.androidRipple = ColorUtilsKt.getColorCompat(context, R.color.android_ripple_light);
        int i12 = R.color.primary_430;
        this.backgroundAccent = ColorUtilsKt.getColorCompat(context, i12);
        this.backgroundFloating = ColorUtilsKt.getColorCompat(context, i10);
        this.backgroundMentioned = ColorUtilsKt.getColorCompat(context, R.color.background_mentioned_light);
        this.backgroundMentionedHover = ColorUtilsKt.getColorCompat(context, R.color.background_mentioned_hover_light);
        this.backgroundMessageAutomod = ColorUtilsKt.getColorCompat(context, R.color.background_message_automod_light);
        this.backgroundMessageAutomodHover = ColorUtilsKt.getColorCompat(context, R.color.background_message_automod_hover_light);
        this.backgroundMessageHighlight = ColorUtilsKt.getColorCompat(context, R.color.background_message_highlight_light);
        this.backgroundMessageHighlightHover = ColorUtilsKt.getColorCompat(context, R.color.background_message_highlight_hover_light);
        this.backgroundMessageHover = ColorUtilsKt.getColorCompat(context, R.color.background_message_hover_light);
        this.backgroundMobilePrimary = ColorUtilsKt.getColorCompat(context, i11);
        this.backgroundMobileSecondary = ColorUtilsKt.getColorCompat(context, i10);
        this.backgroundModifierAccent = ColorUtilsKt.getColorCompat(context, R.color.background_modifier_accent_light);
        this.backgroundModifierAccent2 = ColorUtilsKt.getColorCompat(context, R.color.background_modifier_accent_2_light);
        this.backgroundModifierActive = ColorUtilsKt.getColorCompat(context, R.color.background_modifier_active_light);
        this.backgroundModifierHover = ColorUtilsKt.getColorCompat(context, R.color.background_modifier_hover_light);
        this.backgroundModifierSelected = ColorUtilsKt.getColorCompat(context, R.color.background_modifier_selected_light);
        this.backgroundNestedFloating = ColorUtilsKt.getColorCompat(context, i10);
        this.backgroundPrimary = ColorUtilsKt.getColorCompat(context, i10);
        int i13 = R.color.primary_130;
        this.backgroundSecondary = ColorUtilsKt.getColorCompat(context, i13);
        int i14 = R.color.primary_160;
        this.backgroundSecondaryAlt = ColorUtilsKt.getColorCompat(context, i14);
        int i15 = R.color.primary_200;
        this.backgroundTertiary = ColorUtilsKt.getColorCompat(context, i15);
        int i16 = R.color.black_500;
        this.black = ColorUtilsKt.getColorCompat(context, i16);
        this.borderStrong = ColorUtilsKt.getColorCompat(context, R.color.border_strong_light);
        this.borderSubtle = ColorUtilsKt.getColorCompat(context, R.color.border_subtle_light);
        this.bugReporterModalSubmittingBackground = ColorUtilsKt.getColorCompat(context, R.color.bug_reporter_modal_submitting_background_light);
        this.buttonCreatorRevenueBackground = ColorUtilsKt.getColorCompat(context, R.color.teal_430);
        int i17 = R.color.red_430;
        this.buttonDangerBackground = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, R.color.red_530);
        this.buttonDangerBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i17);
        int i18 = R.color.red_500;
        this.buttonDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, i18);
        this.buttonOutlineBrandBackground = ColorUtilsKt.getColorCompat(context, R.color.button_outline_brand_background_light);
        int i19 = R.color.brand_560;
        this.buttonOutlineBrandBackgroundActive = ColorUtilsKt.getColorCompat(context, i19);
        int i20 = R.color.brand_500;
        this.buttonOutlineBrandBackgroundHover = ColorUtilsKt.getColorCompat(context, i20);
        this.buttonOutlineBrandBorder = ColorUtilsKt.getColorCompat(context, i20);
        this.buttonOutlineBrandBorderActive = ColorUtilsKt.getColorCompat(context, i19);
        this.buttonOutlineBrandBorderHover = ColorUtilsKt.getColorCompat(context, i20);
        this.buttonOutlineBrandText = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlineBrandTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineBrandTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineDangerBackground = ColorUtilsKt.getColorCompat(context, R.color.button_outline_danger_background_light);
        int i21 = R.color.red_460;
        this.buttonOutlineDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, i21);
        this.buttonOutlineDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonOutlineDangerBorder = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonOutlineDangerBorderActive = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonOutlineDangerBorderHover = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonOutlineDangerText = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlineDangerTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineDangerTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePositiveBackground = ColorUtilsKt.getColorCompat(context, R.color.button_outline_positive_background_light);
        int i22 = R.color.green_530;
        this.buttonOutlinePositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i22);
        int i23 = R.color.green_430;
        this.buttonOutlinePositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i23);
        int i24 = R.color.green_400;
        this.buttonOutlinePositiveBorder = ColorUtilsKt.getColorCompat(context, i24);
        this.buttonOutlinePositiveBorderActive = ColorUtilsKt.getColorCompat(context, i22);
        this.buttonOutlinePositiveBorderHover = ColorUtilsKt.getColorCompat(context, i23);
        this.buttonOutlinePositiveText = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePositiveTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePositiveTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePrimaryBackground = ColorUtilsKt.getColorCompat(context, R.color.button_outline_primary_background_light);
        int i25 = R.color.primary_600;
        this.buttonOutlinePrimaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i25);
        int i26 = R.color.primary_530;
        this.buttonOutlinePrimaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i26);
        this.buttonOutlinePrimaryBorder = ColorUtilsKt.getColorCompat(context, i26);
        this.buttonOutlinePrimaryBorderActive = ColorUtilsKt.getColorCompat(context, i25);
        this.buttonOutlinePrimaryBorderHover = ColorUtilsKt.getColorCompat(context, i26);
        this.buttonOutlinePrimaryText = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePrimaryTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePrimaryTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonPositiveBackground = ColorUtilsKt.getColorCompat(context, i23);
        this.buttonPositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i22);
        this.buttonPositiveBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i23);
        this.buttonPositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i22);
        this.buttonSecondaryBackground = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonSecondaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i26);
        this.buttonSecondaryBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i12);
        int i27 = R.color.primary_500;
        this.buttonSecondaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i27);
        this.channelIcon = ColorUtilsKt.getColorCompat(context, i12);
        int i28 = R.color.primary_400;
        this.channelTextAreaPlaceholder = ColorUtilsKt.getColorCompat(context, i28);
        int i29 = R.color.primary_460;
        this.channelsDefault = ColorUtilsKt.getColorCompat(context, i29);
        this.channeltextareaBackground = ColorUtilsKt.getColorCompat(context, i14);
        this.chatBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.chatBorder = ColorUtilsKt.getColorCompat(context, i15);
        this.chatInputContainerBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.controlBrandForeground = ColorUtilsKt.getColorCompat(context, i20);
        this.controlBrandForegroundNew = ColorUtilsKt.getColorCompat(context, i20);
        int i30 = R.color.teal_400;
        this.creatorRevenueIconGradientEnd = ColorUtilsKt.getColorCompat(context, i30);
        int i31 = R.color.teal_345;
        this.creatorRevenueIconGradientStart = ColorUtilsKt.getColorCompat(context, i31);
        this.creatorRevenueInfoBoxBackground = ColorUtilsKt.getColorCompat(context, R.color.creator_revenue_info_box_background_light);
        this.creatorRevenueInfoBoxBorder = ColorUtilsKt.getColorCompat(context, i30);
        this.creatorRevenueLockedChannelIcon = ColorUtilsKt.getColorCompat(context, i30);
        this.creatorRevenueProgressBar = ColorUtilsKt.getColorCompat(context, i31);
        this.deprecatedCardBg = ColorUtilsKt.getColorCompat(context, i11);
        this.deprecatedCardEditableBg = ColorUtilsKt.getColorCompat(context, R.color.deprecated_card_editable_bg_light);
        this.deprecatedQuickswitcherInputBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.deprecatedQuickswitcherInputPlaceholder = ColorUtilsKt.getColorCompat(context, R.color.deprecated_quickswitcher_input_placeholder_light);
        this.deprecatedStoreBg = ColorUtilsKt.getColorCompat(context, i11);
        this.deprecatedTextInputBg = ColorUtilsKt.getColorCompat(context, i15);
        this.deprecatedTextInputBorder = ColorUtilsKt.getColorCompat(context, R.color.deprecated_text_input_border_light);
        this.deprecatedTextInputBorderDisabled = ColorUtilsKt.getColorCompat(context, i15);
        int i32 = R.color.primary_300;
        this.deprecatedTextInputBorderHover = ColorUtilsKt.getColorCompat(context, i32);
        this.deprecatedTextInputPrefix = ColorUtilsKt.getColorCompat(context, i32);
        this.displayBannerOverflowBackground = ColorUtilsKt.getColorCompat(context, R.color.display_banner_overflow_background_light);
        this.dividerStrong = ColorUtilsKt.getColorCompat(context, R.color.divider_strong_light);
        this.dividerSubtle = ColorUtilsKt.getColorCompat(context, R.color.divider_subtle_light);
        this.focusPrimary = ColorUtilsKt.getColorCompat(context, R.color.blue_345);
        this.forumPostExtraMediaCountContainerBackground = ColorUtilsKt.getColorCompat(context, R.color.forum_post_extra_media_count_container_background_light);
        this.forumPostTagBackground = ColorUtilsKt.getColorCompat(context, R.color.forum_post_tag_background_light);
        this.headerMuted = ColorUtilsKt.getColorCompat(context, i29);
        int i33 = R.color.primary_860;
        this.headerPrimary = ColorUtilsKt.getColorCompat(context, i33);
        this.headerSecondary = ColorUtilsKt.getColorCompat(context, i27);
        this.homeBackground = ColorUtilsKt.getColorCompat(context, i11);
        this.homeCardRestingBorder = ColorUtilsKt.getColorCompat(context, R.color.home_card_resting_border_light);
        this.iconMuted = ColorUtilsKt.getColorCompat(context, i32);
        this.iconPrimary = ColorUtilsKt.getColorCompat(context, i33);
        this.iconSecondary = ColorUtilsKt.getColorCompat(context, i27);
        this.infoBoxBackground = ColorUtilsKt.getColorCompat(context, R.color.info_box_background_light);
        this.infoDangerBackground = ColorUtilsKt.getColorCompat(context, R.color.info_danger_background_light);
        this.infoDangerForeground = ColorUtilsKt.getColorCompat(context, i17);
        this.infoDangerText = ColorUtilsKt.getColorCompat(context, i16);
        this.infoHelpBackground = ColorUtilsKt.getColorCompat(context, R.color.info_help_background_light);
        int i34 = R.color.blue_430;
        this.infoHelpForeground = ColorUtilsKt.getColorCompat(context, i34);
        this.infoHelpText = ColorUtilsKt.getColorCompat(context, i16);
        this.infoPositiveBackground = ColorUtilsKt.getColorCompat(context, R.color.info_positive_background_light);
        this.infoPositiveForeground = ColorUtilsKt.getColorCompat(context, i24);
        this.infoPositiveText = ColorUtilsKt.getColorCompat(context, i16);
        this.infoWarningBackground = ColorUtilsKt.getColorCompat(context, R.color.info_warning_background_light);
        int i35 = R.color.yellow_400;
        this.infoWarningForeground = ColorUtilsKt.getColorCompat(context, i35);
        this.infoWarningText = ColorUtilsKt.getColorCompat(context, i16);
        this.inputBackground = ColorUtilsKt.getColorCompat(context, i15);
        this.inputPlaceholderText = ColorUtilsKt.getColorCompat(context, R.color.primary_560);
        this.interactiveActive = ColorUtilsKt.getColorCompat(context, i33);
        this.interactiveHover = ColorUtilsKt.getColorCompat(context, i25);
        this.interactiveMuted = ColorUtilsKt.getColorCompat(context, i32);
        this.interactiveNormal = ColorUtilsKt.getColorCompat(context, i27);
        this.liveStageTileBorder = ColorUtilsKt.getColorCompat(context, R.color.live_stage_tile_border_light);
        this.logoPrimary = ColorUtilsKt.getColorCompat(context, i20);
        this.mentionBackground = ColorUtilsKt.getColorCompat(context, R.color.mention_background_light);
        this.mentionForeground = ColorUtilsKt.getColorCompat(context, i20);
        this.modalBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.modalFooterBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.profileGradientMessageInputBorder = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_message_input_border_light);
        this.profileGradientNoteBackground = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_note_background_light);
        this.profileGradientOverlay = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_overlay_light);
        this.profileGradientOverlaySyncedWithUserTheme = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_overlay_synced_with_user_theme_light);
        this.profileGradientProfileBodyBackgroundHover = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_profile_body_background_hover_light);
        this.profileGradientRolePillBackground = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_role_pill_background_light);
        this.profileGradientRolePillBorder = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_role_pill_border_light);
        this.profileGradientSectionBox = ColorUtilsKt.getColorCompat(context, R.color.profile_gradient_section_box_light);
        this.redesignActivityCardBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignActivityCardBackgroundPressed = ColorUtilsKt.getColorCompat(context, i14);
        this.redesignActivityCardBadgeIcon = ColorUtilsKt.getColorCompat(context, i28);
        this.redesignActivityCardBorder = ColorUtilsKt.getColorCompat(context, R.color.redesign_activity_card_border_light);
        int i36 = R.color.primary_230;
        this.redesignActivityCardOverflowBackground = ColorUtilsKt.getColorCompat(context, i36);
        this.redesignButtonDangerBackground = ColorUtilsKt.getColorCompat(context, i17);
        this.redesignButtonDangerPressedBackground = ColorUtilsKt.getColorCompat(context, i21);
        this.redesignButtonDangerText = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonOverlayAlphaBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_overlay_alpha_background_light);
        this.redesignButtonOverlayAlphaPressedBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_overlay_alpha_pressed_background_light);
        this.redesignButtonOverlayAlphaText = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonOverlayBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonOverlayPressedBackground = ColorUtilsKt.getColorCompat(context, i36);
        this.redesignButtonOverlayText = ColorUtilsKt.getColorCompat(context, i33);
        this.redesignButtonPositiveBackground = ColorUtilsKt.getColorCompat(context, i23);
        this.redesignButtonPositivePressedBackground = ColorUtilsKt.getColorCompat(context, R.color.green_460);
        this.redesignButtonPositiveText = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonPrimaryAltBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_primary_alt_background_light);
        this.redesignButtonPrimaryAltBorder = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignButtonPrimaryAltOnBlurpleBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_primary_alt_on_blurple_background_light);
        this.redesignButtonPrimaryAltOnBlurpleBorder = ColorUtilsKt.getColorCompat(context, i10);
        int i37 = R.color.brand_530;
        this.redesignButtonPrimaryAltOnBlurplePressedBackground = ColorUtilsKt.getColorCompat(context, i37);
        this.redesignButtonPrimaryAltOnBlurplePressedBorder = ColorUtilsKt.getColorCompat(context, R.color.brand_360);
        this.redesignButtonPrimaryAltOnBlurpleText = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonPrimaryAltPressedBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_primary_alt_pressed_background_light);
        this.redesignButtonPrimaryAltPressedBorder = ColorUtilsKt.getColorCompat(context, R.color.brand_330);
        this.redesignButtonPrimaryAltPressedText = ColorUtilsKt.getColorCompat(context, i19);
        this.redesignButtonPrimaryAltText = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignButtonPrimaryBackground = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignButtonPrimaryOnBlurpleBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonPrimaryOnBlurplePressedBackground = ColorUtilsKt.getColorCompat(context, R.color.brand_200);
        this.redesignButtonPrimaryOnBlurplePressedText = ColorUtilsKt.getColorCompat(context, i37);
        this.redesignButtonPrimaryOnBlurpleText = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignButtonPrimaryPressedBackground = ColorUtilsKt.getColorCompat(context, i19);
        this.redesignButtonPrimaryText = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonSecondaryAltBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_secondary_alt_background_light);
        this.redesignButtonSecondaryAltPressedBackground = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_secondary_alt_pressed_background_light);
        this.redesignButtonSecondaryAltPressedText = ColorUtilsKt.getColorCompat(context, i27);
        this.redesignButtonSecondaryAltText = ColorUtilsKt.getColorCompat(context, i25);
        this.redesignButtonSecondaryBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonSecondaryBorder = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_secondary_border_light);
        this.redesignButtonSecondaryPressedBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.redesignButtonSecondaryPressedBorder = ColorUtilsKt.getColorCompat(context, R.color.redesign_button_secondary_pressed_border_light);
        this.redesignButtonSecondaryText = ColorUtilsKt.getColorCompat(context, i25);
        this.redesignInputControlSelected = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignOnlyBackgroundActive = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignOnlyBackgroundDefault = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignOnlyBackgroundOverlay = ColorUtilsKt.getColorCompat(context, i14);
        this.redesignOnlyBackgroundRaised = ColorUtilsKt.getColorCompat(context, i13);
        this.redesignOnlyBackgroundSunken = ColorUtilsKt.getColorCompat(context, i15);
        this.scrollbarAutoScrollbarColorThumb = ColorUtilsKt.getColorCompat(context, i36);
        this.scrollbarAutoScrollbarColorTrack = ColorUtilsKt.getColorCompat(context, i13);
        this.scrollbarAutoThumb = ColorUtilsKt.getColorCompat(context, i32);
        this.scrollbarAutoTrack = ColorUtilsKt.getColorCompat(context, i14);
        this.scrollbarThinThumb = ColorUtilsKt.getColorCompat(context, R.color.scrollbar_thin_thumb_light);
        this.scrollbarThinTrack = ColorUtilsKt.getColorCompat(context, R.color.scrollbar_thin_track_light);
        this.spoilerHiddenBackground = ColorUtilsKt.getColorCompat(context, i15);
        this.spoilerRevealedBackground = ColorUtilsKt.getColorCompat(context, i14);
        this.statusDanger = ColorUtilsKt.getColorCompat(context, i17);
        this.statusDangerBackground = ColorUtilsKt.getColorCompat(context, i17);
        this.statusDangerText = ColorUtilsKt.getColorCompat(context, i10);
        this.statusDnd = ColorUtilsKt.getColorCompat(context, i17);
        this.statusIdle = ColorUtilsKt.getColorCompat(context, i35);
        this.statusOffline = ColorUtilsKt.getColorCompat(context, i29);
        this.statusOnline = ColorUtilsKt.getColorCompat(context, i24);
        this.statusPositive = ColorUtilsKt.getColorCompat(context, i24);
        this.statusPositiveBackground = ColorUtilsKt.getColorCompat(context, i23);
        this.statusPositiveText = ColorUtilsKt.getColorCompat(context, i10);
        this.statusWarning = ColorUtilsKt.getColorCompat(context, i35);
        this.statusWarningBackground = ColorUtilsKt.getColorCompat(context, i35);
        this.statusWarningText = ColorUtilsKt.getColorCompat(context, i10);
        this.textBrand = ColorUtilsKt.getColorCompat(context, i20);
        this.textDanger = ColorUtilsKt.getColorCompat(context, i18);
        this.textLink = ColorUtilsKt.getColorCompat(context, i34);
        this.textLinkLowSaturation = ColorUtilsKt.getColorCompat(context, i34);
        this.textLowContrast = ColorUtilsKt.getColorCompat(context, i29);
        this.textMessagePreviewLowSat = ColorUtilsKt.getColorCompat(context, i29);
        this.textMuted = ColorUtilsKt.getColorCompat(context, i29);
        this.textMutedOnDefault = ColorUtilsKt.getColorCompat(context, i12);
        this.textNormal = ColorUtilsKt.getColorCompat(context, i25);
        this.textPositive = ColorUtilsKt.getColorCompat(context, i23);
        this.textPrimary = ColorUtilsKt.getColorCompat(context, i25);
        this.textSecondary = ColorUtilsKt.getColorCompat(context, i27);
        this.textWarning = ColorUtilsKt.getColorCompat(context, R.color.yellow_430);
        this.textboxMarkdownSyntax = ColorUtilsKt.getColorCompat(context, i26);
        this.userProfileHeaderOverflowBackground = ColorUtilsKt.getColorCompat(context, R.color.user_profile_header_overflow_background_light);
        this.white = ColorUtilsKt.getColorCompat(context, i10);
    }

    @Override 
    public int getActivityCardBackground() {
        return this.activityCardBackground;
    }

    @Override 
    public int getAndroidNavigationBarBackground() {
        return this.androidNavigationBarBackground;
    }

    @Override 
    public int getAndroidNavigationScrimBackground() {
        return this.androidNavigationScrimBackground;
    }

    @Override 
    public int getAndroidRipple() {
        return this.androidRipple;
    }

    @Override 
    public int getBackgroundAccent() {
        return this.backgroundAccent;
    }

    @Override 
    public int getBackgroundFloating() {
        return this.backgroundFloating;
    }

    @Override 
    public int getBackgroundMentioned() {
        return this.backgroundMentioned;
    }

    @Override 
    public int getBackgroundMentionedHover() {
        return this.backgroundMentionedHover;
    }

    @Override 
    public int getBackgroundMessageAutomod() {
        return this.backgroundMessageAutomod;
    }

    @Override 
    public int getBackgroundMessageAutomodHover() {
        return this.backgroundMessageAutomodHover;
    }

    @Override 
    public int getBackgroundMessageHighlight() {
        return this.backgroundMessageHighlight;
    }

    @Override 
    public int getBackgroundMessageHighlightHover() {
        return this.backgroundMessageHighlightHover;
    }

    @Override 
    public int getBackgroundMessageHover() {
        return this.backgroundMessageHover;
    }

    @Override 
    public int getBackgroundMobilePrimary() {
        return this.backgroundMobilePrimary;
    }

    @Override 
    public int getBackgroundMobileSecondary() {
        return this.backgroundMobileSecondary;
    }

    @Override 
    public int getBackgroundModifierAccent() {
        return this.backgroundModifierAccent;
    }

    @Override 
    public int getBackgroundModifierAccent2() {
        return this.backgroundModifierAccent2;
    }

    @Override 
    public int getBackgroundModifierActive() {
        return this.backgroundModifierActive;
    }

    @Override 
    public int getBackgroundModifierHover() {
        return this.backgroundModifierHover;
    }

    @Override 
    public int getBackgroundModifierSelected() {
        return this.backgroundModifierSelected;
    }

    @Override 
    public int getBackgroundNestedFloating() {
        return this.backgroundNestedFloating;
    }

    @Override 
    public int getBackgroundPrimary() {
        return this.backgroundPrimary;
    }

    @Override 
    public int getBackgroundSecondary() {
        return this.backgroundSecondary;
    }

    @Override 
    public int getBackgroundSecondaryAlt() {
        return this.backgroundSecondaryAlt;
    }

    @Override 
    public int getBackgroundTertiary() {
        return this.backgroundTertiary;
    }

    @Override 
    public int getBlack() {
        return this.black;
    }

    @Override 
    public int getBorderStrong() {
        return this.borderStrong;
    }

    @Override 
    public int getBorderSubtle() {
        return this.borderSubtle;
    }

    @Override 
    public int getBugReporterModalSubmittingBackground() {
        return this.bugReporterModalSubmittingBackground;
    }

    @Override 
    public int getButtonCreatorRevenueBackground() {
        return this.buttonCreatorRevenueBackground;
    }

    @Override 
    public int getButtonDangerBackground() {
        return this.buttonDangerBackground;
    }

    @Override 
    public int getButtonDangerBackgroundActive() {
        return this.buttonDangerBackgroundActive;
    }

    @Override 
    public int getButtonDangerBackgroundDisabled() {
        return this.buttonDangerBackgroundDisabled;
    }

    @Override 
    public int getButtonDangerBackgroundHover() {
        return this.buttonDangerBackgroundHover;
    }

    @Override 
    public int getButtonOutlineBrandBackground() {
        return this.buttonOutlineBrandBackground;
    }

    @Override 
    public int getButtonOutlineBrandBackgroundActive() {
        return this.buttonOutlineBrandBackgroundActive;
    }

    @Override 
    public int getButtonOutlineBrandBackgroundHover() {
        return this.buttonOutlineBrandBackgroundHover;
    }

    @Override 
    public int getButtonOutlineBrandBorder() {
        return this.buttonOutlineBrandBorder;
    }

    @Override 
    public int getButtonOutlineBrandBorderActive() {
        return this.buttonOutlineBrandBorderActive;
    }

    @Override 
    public int getButtonOutlineBrandBorderHover() {
        return this.buttonOutlineBrandBorderHover;
    }

    @Override 
    public int getButtonOutlineBrandText() {
        return this.buttonOutlineBrandText;
    }

    @Override 
    public int getButtonOutlineBrandTextActive() {
        return this.buttonOutlineBrandTextActive;
    }

    @Override 
    public int getButtonOutlineBrandTextHover() {
        return this.buttonOutlineBrandTextHover;
    }

    @Override 
    public int getButtonOutlineDangerBackground() {
        return this.buttonOutlineDangerBackground;
    }

    @Override 
    public int getButtonOutlineDangerBackgroundActive() {
        return this.buttonOutlineDangerBackgroundActive;
    }

    @Override 
    public int getButtonOutlineDangerBackgroundHover() {
        return this.buttonOutlineDangerBackgroundHover;
    }

    @Override 
    public int getButtonOutlineDangerBorder() {
        return this.buttonOutlineDangerBorder;
    }

    @Override 
    public int getButtonOutlineDangerBorderActive() {
        return this.buttonOutlineDangerBorderActive;
    }

    @Override 
    public int getButtonOutlineDangerBorderHover() {
        return this.buttonOutlineDangerBorderHover;
    }

    @Override 
    public int getButtonOutlineDangerText() {
        return this.buttonOutlineDangerText;
    }

    @Override 
    public int getButtonOutlineDangerTextActive() {
        return this.buttonOutlineDangerTextActive;
    }

    @Override 
    public int getButtonOutlineDangerTextHover() {
        return this.buttonOutlineDangerTextHover;
    }

    @Override 
    public int getButtonOutlinePositiveBackground() {
        return this.buttonOutlinePositiveBackground;
    }

    @Override 
    public int getButtonOutlinePositiveBackgroundActive() {
        return this.buttonOutlinePositiveBackgroundActive;
    }

    @Override 
    public int getButtonOutlinePositiveBackgroundHover() {
        return this.buttonOutlinePositiveBackgroundHover;
    }

    @Override 
    public int getButtonOutlinePositiveBorder() {
        return this.buttonOutlinePositiveBorder;
    }

    @Override 
    public int getButtonOutlinePositiveBorderActive() {
        return this.buttonOutlinePositiveBorderActive;
    }

    @Override 
    public int getButtonOutlinePositiveBorderHover() {
        return this.buttonOutlinePositiveBorderHover;
    }

    @Override 
    public int getButtonOutlinePositiveText() {
        return this.buttonOutlinePositiveText;
    }

    @Override 
    public int getButtonOutlinePositiveTextActive() {
        return this.buttonOutlinePositiveTextActive;
    }

    @Override 
    public int getButtonOutlinePositiveTextHover() {
        return this.buttonOutlinePositiveTextHover;
    }

    @Override 
    public int getButtonOutlinePrimaryBackground() {
        return this.buttonOutlinePrimaryBackground;
    }

    @Override 
    public int getButtonOutlinePrimaryBackgroundActive() {
        return this.buttonOutlinePrimaryBackgroundActive;
    }

    @Override 
    public int getButtonOutlinePrimaryBackgroundHover() {
        return this.buttonOutlinePrimaryBackgroundHover;
    }

    @Override 
    public int getButtonOutlinePrimaryBorder() {
        return this.buttonOutlinePrimaryBorder;
    }

    @Override 
    public int getButtonOutlinePrimaryBorderActive() {
        return this.buttonOutlinePrimaryBorderActive;
    }

    @Override 
    public int getButtonOutlinePrimaryBorderHover() {
        return this.buttonOutlinePrimaryBorderHover;
    }

    @Override 
    public int getButtonOutlinePrimaryText() {
        return this.buttonOutlinePrimaryText;
    }

    @Override 
    public int getButtonOutlinePrimaryTextActive() {
        return this.buttonOutlinePrimaryTextActive;
    }

    @Override 
    public int getButtonOutlinePrimaryTextHover() {
        return this.buttonOutlinePrimaryTextHover;
    }

    @Override 
    public int getButtonPositiveBackground() {
        return this.buttonPositiveBackground;
    }

    @Override 
    public int getButtonPositiveBackgroundActive() {
        return this.buttonPositiveBackgroundActive;
    }

    @Override 
    public int getButtonPositiveBackgroundDisabled() {
        return this.buttonPositiveBackgroundDisabled;
    }

    @Override 
    public int getButtonPositiveBackgroundHover() {
        return this.buttonPositiveBackgroundHover;
    }

    @Override 
    public int getButtonSecondaryBackground() {
        return this.buttonSecondaryBackground;
    }

    @Override 
    public int getButtonSecondaryBackgroundActive() {
        return this.buttonSecondaryBackgroundActive;
    }

    @Override 
    public int getButtonSecondaryBackgroundDisabled() {
        return this.buttonSecondaryBackgroundDisabled;
    }

    @Override 
    public int getButtonSecondaryBackgroundHover() {
        return this.buttonSecondaryBackgroundHover;
    }

    @Override 
    public int getChannelIcon() {
        return this.channelIcon;
    }

    @Override 
    public int getChannelTextAreaPlaceholder() {
        return this.channelTextAreaPlaceholder;
    }

    @Override 
    public int getChannelsDefault() {
        return this.channelsDefault;
    }

    @Override 
    public int getChanneltextareaBackground() {
        return this.channeltextareaBackground;
    }

    @Override 
    public int getChatBackground() {
        return this.chatBackground;
    }

    @Override 
    public int getChatBorder() {
        return this.chatBorder;
    }

    @Override 
    public int getChatInputContainerBackground() {
        return this.chatInputContainerBackground;
    }

    @Override 
    public int getColor(int i10, int i11) {
        return i10;
    }

    @Override 
    public int getColorRes(int i10, int i11) {
        return i10;
    }

    @Override 
    public int getControlBrandForeground() {
        return this.controlBrandForeground;
    }

    @Override 
    public int getControlBrandForegroundNew() {
        return this.controlBrandForegroundNew;
    }

    @Override 
    public int getCreatorRevenueIconGradientEnd() {
        return this.creatorRevenueIconGradientEnd;
    }

    @Override 
    public int getCreatorRevenueIconGradientStart() {
        return this.creatorRevenueIconGradientStart;
    }

    @Override 
    public int getCreatorRevenueInfoBoxBackground() {
        return this.creatorRevenueInfoBoxBackground;
    }

    @Override 
    public int getCreatorRevenueInfoBoxBorder() {
        return this.creatorRevenueInfoBoxBorder;
    }

    @Override 
    public int getCreatorRevenueLockedChannelIcon() {
        return this.creatorRevenueLockedChannelIcon;
    }

    @Override 
    public int getCreatorRevenueProgressBar() {
        return this.creatorRevenueProgressBar;
    }

    @Override 
    public int getDeprecatedCardBg() {
        return this.deprecatedCardBg;
    }

    @Override 
    public int getDeprecatedCardEditableBg() {
        return this.deprecatedCardEditableBg;
    }

    @Override 
    public int getDeprecatedQuickswitcherInputBackground() {
        return this.deprecatedQuickswitcherInputBackground;
    }

    @Override 
    public int getDeprecatedQuickswitcherInputPlaceholder() {
        return this.deprecatedQuickswitcherInputPlaceholder;
    }

    @Override 
    public int getDeprecatedStoreBg() {
        return this.deprecatedStoreBg;
    }

    @Override 
    public int getDeprecatedTextInputBg() {
        return this.deprecatedTextInputBg;
    }

    @Override 
    public int getDeprecatedTextInputBorder() {
        return this.deprecatedTextInputBorder;
    }

    @Override 
    public int getDeprecatedTextInputBorderDisabled() {
        return this.deprecatedTextInputBorderDisabled;
    }

    @Override 
    public int getDeprecatedTextInputBorderHover() {
        return this.deprecatedTextInputBorderHover;
    }

    @Override 
    public int getDeprecatedTextInputPrefix() {
        return this.deprecatedTextInputPrefix;
    }

    @Override 
    public int getDisplayBannerOverflowBackground() {
        return this.displayBannerOverflowBackground;
    }

    @Override 
    public int getDividerStrong() {
        return this.dividerStrong;
    }

    @Override 
    public int getDividerSubtle() {
        return this.dividerSubtle;
    }

    @Override 
    public int getFocusPrimary() {
        return this.focusPrimary;
    }

    @Override 
    public int getForumPostExtraMediaCountContainerBackground() {
        return this.forumPostExtraMediaCountContainerBackground;
    }

    @Override 
    public int getForumPostTagBackground() {
        return this.forumPostTagBackground;
    }

    @Override 
    public int getHeaderMuted() {
        return this.headerMuted;
    }

    @Override 
    public int getHeaderPrimary() {
        return this.headerPrimary;
    }

    @Override 
    public int getHeaderSecondary() {
        return this.headerSecondary;
    }

    @Override 
    public int getHomeBackground() {
        return this.homeBackground;
    }

    @Override 
    public int getHomeCardRestingBorder() {
        return this.homeCardRestingBorder;
    }

    @Override 
    public int getIconMuted() {
        return this.iconMuted;
    }

    @Override 
    public int getIconPrimary() {
        return this.iconPrimary;
    }

    @Override 
    public int getIconSecondary() {
        return this.iconSecondary;
    }

    @Override 
    public int getInfoBoxBackground() {
        return this.infoBoxBackground;
    }

    @Override 
    public int getInfoDangerBackground() {
        return this.infoDangerBackground;
    }

    @Override 
    public int getInfoDangerForeground() {
        return this.infoDangerForeground;
    }

    @Override 
    public int getInfoDangerText() {
        return this.infoDangerText;
    }

    @Override 
    public int getInfoHelpBackground() {
        return this.infoHelpBackground;
    }

    @Override 
    public int getInfoHelpForeground() {
        return this.infoHelpForeground;
    }

    @Override 
    public int getInfoHelpText() {
        return this.infoHelpText;
    }

    @Override 
    public int getInfoPositiveBackground() {
        return this.infoPositiveBackground;
    }

    @Override 
    public int getInfoPositiveForeground() {
        return this.infoPositiveForeground;
    }

    @Override 
    public int getInfoPositiveText() {
        return this.infoPositiveText;
    }

    @Override 
    public int getInfoWarningBackground() {
        return this.infoWarningBackground;
    }

    @Override 
    public int getInfoWarningForeground() {
        return this.infoWarningForeground;
    }

    @Override 
    public int getInfoWarningText() {
        return this.infoWarningText;
    }

    @Override 
    public int getInputBackground() {
        return this.inputBackground;
    }

    @Override 
    public int getInputPlaceholderText() {
        return this.inputPlaceholderText;
    }

    @Override 
    public int getInteractiveActive() {
        return this.interactiveActive;
    }

    @Override 
    public int getInteractiveHover() {
        return this.interactiveHover;
    }

    @Override 
    public int getInteractiveMuted() {
        return this.interactiveMuted;
    }

    @Override 
    public int getInteractiveNormal() {
        return this.interactiveNormal;
    }

    @Override 
    public int getLiveStageTileBorder() {
        return this.liveStageTileBorder;
    }

    @Override 
    public int getLogoPrimary() {
        return this.logoPrimary;
    }

    @Override 
    public int getMentionBackground() {
        return this.mentionBackground;
    }

    @Override 
    public int getMentionForeground() {
        return this.mentionForeground;
    }

    @Override 
    public int getModalBackground() {
        return this.modalBackground;
    }

    @Override 
    public int getModalFooterBackground() {
        return this.modalFooterBackground;
    }

    @Override 
    public int getProfileGradientMessageInputBorder() {
        return this.profileGradientMessageInputBorder;
    }

    @Override 
    public int getProfileGradientNoteBackground() {
        return this.profileGradientNoteBackground;
    }

    @Override 
    public int getProfileGradientOverlay() {
        return this.profileGradientOverlay;
    }

    @Override 
    public int getProfileGradientOverlaySyncedWithUserTheme() {
        return this.profileGradientOverlaySyncedWithUserTheme;
    }

    @Override 
    public int getProfileGradientProfileBodyBackgroundHover() {
        return this.profileGradientProfileBodyBackgroundHover;
    }

    @Override 
    public int getProfileGradientRolePillBackground() {
        return this.profileGradientRolePillBackground;
    }

    @Override 
    public int getProfileGradientRolePillBorder() {
        return this.profileGradientRolePillBorder;
    }

    @Override 
    public int getProfileGradientSectionBox() {
        return this.profileGradientSectionBox;
    }

    @Override 
    public int getRedesignActivityCardBackground() {
        return this.redesignActivityCardBackground;
    }

    @Override 
    public int getRedesignActivityCardBackgroundPressed() {
        return this.redesignActivityCardBackgroundPressed;
    }

    @Override 
    public int getRedesignActivityCardBadgeIcon() {
        return this.redesignActivityCardBadgeIcon;
    }

    @Override 
    public int getRedesignActivityCardBorder() {
        return this.redesignActivityCardBorder;
    }

    @Override 
    public int getRedesignActivityCardOverflowBackground() {
        return this.redesignActivityCardOverflowBackground;
    }

    @Override 
    public int getRedesignButtonDangerBackground() {
        return this.redesignButtonDangerBackground;
    }

    @Override 
    public int getRedesignButtonDangerPressedBackground() {
        return this.redesignButtonDangerPressedBackground;
    }

    @Override 
    public int getRedesignButtonDangerText() {
        return this.redesignButtonDangerText;
    }

    @Override 
    public int getRedesignButtonOverlayAlphaBackground() {
        return this.redesignButtonOverlayAlphaBackground;
    }

    @Override 
    public int getRedesignButtonOverlayAlphaPressedBackground() {
        return this.redesignButtonOverlayAlphaPressedBackground;
    }

    @Override 
    public int getRedesignButtonOverlayAlphaText() {
        return this.redesignButtonOverlayAlphaText;
    }

    @Override 
    public int getRedesignButtonOverlayBackground() {
        return this.redesignButtonOverlayBackground;
    }

    @Override 
    public int getRedesignButtonOverlayPressedBackground() {
        return this.redesignButtonOverlayPressedBackground;
    }

    @Override 
    public int getRedesignButtonOverlayText() {
        return this.redesignButtonOverlayText;
    }

    @Override 
    public int getRedesignButtonPositiveBackground() {
        return this.redesignButtonPositiveBackground;
    }

    @Override 
    public int getRedesignButtonPositivePressedBackground() {
        return this.redesignButtonPositivePressedBackground;
    }

    @Override 
    public int getRedesignButtonPositiveText() {
        return this.redesignButtonPositiveText;
    }

    @Override 
    public int getRedesignButtonPrimaryAltBackground() {
        return this.redesignButtonPrimaryAltBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryAltBorder() {
        return this.redesignButtonPrimaryAltBorder;
    }

    @Override 
    public int getRedesignButtonPrimaryAltOnBlurpleBackground() {
        return this.redesignButtonPrimaryAltOnBlurpleBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryAltOnBlurpleBorder() {
        return this.redesignButtonPrimaryAltOnBlurpleBorder;
    }

    @Override 
    public int getRedesignButtonPrimaryAltOnBlurplePressedBackground() {
        return this.redesignButtonPrimaryAltOnBlurplePressedBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryAltOnBlurplePressedBorder() {
        return this.redesignButtonPrimaryAltOnBlurplePressedBorder;
    }

    @Override 
    public int getRedesignButtonPrimaryAltOnBlurpleText() {
        return this.redesignButtonPrimaryAltOnBlurpleText;
    }

    @Override 
    public int getRedesignButtonPrimaryAltPressedBackground() {
        return this.redesignButtonPrimaryAltPressedBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryAltPressedBorder() {
        return this.redesignButtonPrimaryAltPressedBorder;
    }

    @Override 
    public int getRedesignButtonPrimaryAltPressedText() {
        return this.redesignButtonPrimaryAltPressedText;
    }

    @Override 
    public int getRedesignButtonPrimaryAltText() {
        return this.redesignButtonPrimaryAltText;
    }

    @Override 
    public int getRedesignButtonPrimaryBackground() {
        return this.redesignButtonPrimaryBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryOnBlurpleBackground() {
        return this.redesignButtonPrimaryOnBlurpleBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryOnBlurplePressedBackground() {
        return this.redesignButtonPrimaryOnBlurplePressedBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryOnBlurplePressedText() {
        return this.redesignButtonPrimaryOnBlurplePressedText;
    }

    @Override 
    public int getRedesignButtonPrimaryOnBlurpleText() {
        return this.redesignButtonPrimaryOnBlurpleText;
    }

    @Override 
    public int getRedesignButtonPrimaryPressedBackground() {
        return this.redesignButtonPrimaryPressedBackground;
    }

    @Override 
    public int getRedesignButtonPrimaryText() {
        return this.redesignButtonPrimaryText;
    }

    @Override 
    public int getRedesignButtonSecondaryAltBackground() {
        return this.redesignButtonSecondaryAltBackground;
    }

    @Override 
    public int getRedesignButtonSecondaryAltPressedBackground() {
        return this.redesignButtonSecondaryAltPressedBackground;
    }

    @Override 
    public int getRedesignButtonSecondaryAltPressedText() {
        return this.redesignButtonSecondaryAltPressedText;
    }

    @Override 
    public int getRedesignButtonSecondaryAltText() {
        return this.redesignButtonSecondaryAltText;
    }

    @Override 
    public int getRedesignButtonSecondaryBackground() {
        return this.redesignButtonSecondaryBackground;
    }

    @Override 
    public int getRedesignButtonSecondaryBorder() {
        return this.redesignButtonSecondaryBorder;
    }

    @Override 
    public int getRedesignButtonSecondaryPressedBackground() {
        return this.redesignButtonSecondaryPressedBackground;
    }

    @Override 
    public int getRedesignButtonSecondaryPressedBorder() {
        return this.redesignButtonSecondaryPressedBorder;
    }

    @Override 
    public int getRedesignButtonSecondaryText() {
        return this.redesignButtonSecondaryText;
    }

    @Override 
    public int getRedesignInputControlSelected() {
        return this.redesignInputControlSelected;
    }

    @Override 
    public int getRedesignOnlyBackgroundActive() {
        return this.redesignOnlyBackgroundActive;
    }

    @Override 
    public int getRedesignOnlyBackgroundDefault() {
        return this.redesignOnlyBackgroundDefault;
    }

    @Override 
    public int getRedesignOnlyBackgroundOverlay() {
        return this.redesignOnlyBackgroundOverlay;
    }

    @Override 
    public int getRedesignOnlyBackgroundRaised() {
        return this.redesignOnlyBackgroundRaised;
    }

    @Override 
    public int getRedesignOnlyBackgroundSunken() {
        return this.redesignOnlyBackgroundSunken;
    }

    @Override 
    public int getScrollbarAutoScrollbarColorThumb() {
        return this.scrollbarAutoScrollbarColorThumb;
    }

    @Override 
    public int getScrollbarAutoScrollbarColorTrack() {
        return this.scrollbarAutoScrollbarColorTrack;
    }

    @Override 
    public int getScrollbarAutoThumb() {
        return this.scrollbarAutoThumb;
    }

    @Override 
    public int getScrollbarAutoTrack() {
        return this.scrollbarAutoTrack;
    }

    @Override 
    public int getScrollbarThinThumb() {
        return this.scrollbarThinThumb;
    }

    @Override 
    public int getScrollbarThinTrack() {
        return this.scrollbarThinTrack;
    }

    @Override 
    public int getSpoilerHiddenBackground() {
        return this.spoilerHiddenBackground;
    }

    @Override 
    public int getSpoilerRevealedBackground() {
        return this.spoilerRevealedBackground;
    }

    @Override 
    public int getStatusDanger() {
        return this.statusDanger;
    }

    @Override 
    public int getStatusDangerBackground() {
        return this.statusDangerBackground;
    }

    @Override 
    public int getStatusDangerText() {
        return this.statusDangerText;
    }

    @Override 
    public int getStatusDnd() {
        return this.statusDnd;
    }

    @Override 
    public int getStatusIdle() {
        return this.statusIdle;
    }

    @Override 
    public int getStatusOffline() {
        return this.statusOffline;
    }

    @Override 
    public int getStatusOnline() {
        return this.statusOnline;
    }

    @Override 
    public int getStatusPositive() {
        return this.statusPositive;
    }

    @Override 
    public int getStatusPositiveBackground() {
        return this.statusPositiveBackground;
    }

    @Override 
    public int getStatusPositiveText() {
        return this.statusPositiveText;
    }

    @Override 
    public int getStatusWarning() {
        return this.statusWarning;
    }

    @Override 
    public int getStatusWarningBackground() {
        return this.statusWarningBackground;
    }

    @Override 
    public int getStatusWarningText() {
        return this.statusWarningText;
    }

    @Override 
    public int getTextBrand() {
        return this.textBrand;
    }

    @Override 
    public int getTextDanger() {
        return this.textDanger;
    }

    @Override 
    public int getTextLink() {
        return this.textLink;
    }

    @Override 
    public int getTextLinkLowSaturation() {
        return this.textLinkLowSaturation;
    }

    @Override 
    public int getTextLowContrast() {
        return this.textLowContrast;
    }

    @Override 
    public int getTextMessagePreviewLowSat() {
        return this.textMessagePreviewLowSat;
    }

    @Override 
    public int getTextMuted() {
        return this.textMuted;
    }

    @Override 
    public int getTextMutedOnDefault() {
        return this.textMutedOnDefault;
    }

    @Override 
    public int getTextNormal() {
        return this.textNormal;
    }

    @Override 
    public int getTextPositive() {
        return this.textPositive;
    }

    @Override 
    public int getTextPrimary() {
        return this.textPrimary;
    }

    @Override 
    public int getTextSecondary() {
        return this.textSecondary;
    }

    @Override 
    public int getTextWarning() {
        return this.textWarning;
    }

    @Override 
    public int getTextboxMarkdownSyntax() {
        return this.textboxMarkdownSyntax;
    }

    @Override 
    public int getUserProfileHeaderOverflowBackground() {
        return this.userProfileHeaderOverflowBackground;
    }

    @Override 
    public int getWhite() {
        return this.white;
    }
}
