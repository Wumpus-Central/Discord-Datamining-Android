package com.discord.theme;

import android.content.Context;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\bß\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010ß\u0002\u001a\u00020\u00062\u0007\u0010à\u0002\u001a\u00020\u00062\u0007\u0010á\u0002\u001a\u00020\u0006H\u0016J\u001b\u0010â\u0002\u001a\u00020\u00062\u0007\u0010ã\u0002\u001a\u00020\u00062\u0007\u0010ä\u0002\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0014\u0010)\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0014\u0010+\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0014\u0010-\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0014\u0010/\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0014\u00101\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0014\u00103\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0014\u00107\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\bR\u0014\u0010;\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\bR\u0014\u0010?\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\bR\u0014\u0010A\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR\u0014\u0010I\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\bR\u0014\u0010K\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\bR\u0014\u0010M\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\bR\u0014\u0010O\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\bR\u0014\u0010S\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\bR\u0014\u0010U\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\bR\u0014\u0010W\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\bR\u0014\u0010Y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\bR\u0014\u0010[\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\bR\u0014\u0010]\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\bR\u0014\u0010_\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\bR\u0014\u0010a\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\bR\u0014\u0010c\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\bR\u0014\u0010e\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\bR\u0014\u0010g\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\bR\u0014\u0010i\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\bR\u0014\u0010k\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\bR\u0014\u0010m\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\bR\u0014\u0010o\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\bR\u0014\u0010q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\bR\u0014\u0010s\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\bR\u0014\u0010u\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\bR\u0014\u0010w\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\bR\u0014\u0010y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\bR\u0014\u0010{\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\bR\u0014\u0010}\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\bR\u0015\u0010\u007f\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0081\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\bR\u0016\u0010\u0085\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\bR\u0016\u0010\u0087\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010\bR\u0016\u0010\u0089\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\bR\u0016\u0010\u008b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010\bR\u0016\u0010\u008d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\bR\u0016\u0010\u008f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\bR\u0016\u0010\u0091\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010\bR\u0016\u0010\u0093\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\bR\u0016\u0010\u0095\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\bR\u0016\u0010\u0097\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010\bR\u0016\u0010\u0099\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010\bR\u0016\u0010\u009b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\bR\u0016\u0010\u009d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\bR\u0016\u0010\u009f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010\bR\u0016\u0010¡\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010\bR\u0016\u0010£\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010\bR\u0016\u0010¥\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\bR\u0016\u0010§\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010\bR\u0016\u0010©\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010\bR\u0016\u0010«\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010\bR\u0016\u0010\u00ad\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010\bR\u0016\u0010¯\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010\bR\u0016\u0010±\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010\bR\u0016\u0010³\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010\bR\u0016\u0010µ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010\bR\u0016\u0010·\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010\bR\u0016\u0010¹\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010\bR\u0016\u0010»\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010\bR\u0016\u0010½\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010\bR\u0016\u0010¿\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010\bR\u0016\u0010Á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010\bR\u0016\u0010Ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010\bR\u0016\u0010Å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010\bR\u0016\u0010Ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010\bR\u0016\u0010É\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010\bR\u0016\u0010Ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010\bR\u0016\u0010Í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010\bR\u0016\u0010Ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\bR\u0016\u0010Ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010\bR\u0016\u0010Ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010\bR\u0016\u0010Õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0001\u0010\bR\u0016\u0010×\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010\bR\u0016\u0010Ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0001\u0010\bR\u0016\u0010Û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010\bR\u0016\u0010Ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010\bR\u0016\u0010ß\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010\bR\u0016\u0010á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010\bR\u0016\u0010ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010\bR\u0016\u0010å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0001\u0010\bR\u0016\u0010ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010\bR\u0016\u0010é\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010\bR\u0016\u0010ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010\bR\u0016\u0010í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010\bR\u0016\u0010ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0001\u0010\bR\u0016\u0010ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0001\u0010\bR\u0016\u0010ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0001\u0010\bR\u0016\u0010õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010\bR\u0016\u0010÷\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0001\u0010\bR\u0016\u0010ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0001\u0010\bR\u0016\u0010û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0001\u0010\bR\u0016\u0010ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0001\u0010\bR\u0016\u0010ÿ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0002\u0010\bR\u0016\u0010\u0081\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0002\u0010\bR\u0016\u0010\u0083\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0002\u0010\bR\u0016\u0010\u0085\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0002\u0010\bR\u0016\u0010\u0087\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0002\u0010\bR\u0016\u0010\u0089\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0002\u0010\bR\u0016\u0010\u008b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0002\u0010\bR\u0016\u0010\u008d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0002\u0010\bR\u0016\u0010\u008f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0002\u0010\bR\u0016\u0010\u0091\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0002\u0010\bR\u0016\u0010\u0093\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0002\u0010\bR\u0016\u0010\u0095\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0002\u0010\bR\u0016\u0010\u0097\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0002\u0010\bR\u0016\u0010\u0099\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0002\u0010\bR\u0016\u0010\u009b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0002\u0010\bR\u0016\u0010\u009d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0002\u0010\bR\u0016\u0010\u009f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0002\u0010\bR\u0016\u0010¡\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0002\u0010\bR\u0016\u0010£\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0002\u0010\bR\u0016\u0010¥\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0002\u0010\bR\u0016\u0010§\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0002\u0010\bR\u0016\u0010©\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0002\u0010\bR\u0016\u0010«\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0002\u0010\bR\u0016\u0010\u00ad\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0002\u0010\bR\u0016\u0010¯\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0002\u0010\bR\u0016\u0010±\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0002\u0010\bR\u0016\u0010³\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0002\u0010\bR\u0016\u0010µ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0002\u0010\bR\u0016\u0010·\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0002\u0010\bR\u0016\u0010¹\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0002\u0010\bR\u0016\u0010»\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0002\u0010\bR\u0016\u0010½\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0002\u0010\bR\u0016\u0010¿\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0002\u0010\bR\u0016\u0010Á\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0002\u0010\bR\u0016\u0010Ã\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0002\u0010\bR\u0016\u0010Å\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0002\u0010\bR\u0016\u0010Ç\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0002\u0010\bR\u0016\u0010É\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0002\u0010\bR\u0016\u0010Ë\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0002\u0010\bR\u0016\u0010Í\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0002\u0010\bR\u0016\u0010Ï\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0002\u0010\bR\u0016\u0010Ñ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0002\u0010\bR\u0016\u0010Ó\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0002\u0010\bR\u0016\u0010Õ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0002\u0010\bR\u0016\u0010×\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0002\u0010\bR\u0016\u0010Ù\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0002\u0010\bR\u0016\u0010Û\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0002\u0010\bR\u0016\u0010Ý\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0002\u0010\b¨\u0006å\u0002"}, m15073d2 = {"Lcom/discord/theme/DarkTheme;", "Lcom/discord/theme/DiscordTheme;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activityCardBackground", "", "getActivityCardBackground", "()I", "androidNavigationBarBackground", "getAndroidNavigationBarBackground", "androidNavigationScrimBackground", "getAndroidNavigationScrimBackground", "androidRipple", "getAndroidRipple", "backgroundAccent", "getBackgroundAccent", "backgroundFloating", "getBackgroundFloating", "backgroundMentioned", "getBackgroundMentioned", "backgroundMentionedHover", "getBackgroundMentionedHover", "backgroundMessageAutomod", "getBackgroundMessageAutomod", "backgroundMessageAutomodHover", "getBackgroundMessageAutomodHover", "backgroundMessageHighlight", "getBackgroundMessageHighlight", "backgroundMessageHighlightHover", "getBackgroundMessageHighlightHover", "backgroundMessageHover", "getBackgroundMessageHover", "backgroundMobilePrimary", "getBackgroundMobilePrimary", "backgroundMobileSecondary", "getBackgroundMobileSecondary", "backgroundModifierAccent", "getBackgroundModifierAccent", "backgroundModifierActive", "getBackgroundModifierActive", "backgroundModifierHover", "getBackgroundModifierHover", "backgroundModifierSelected", "getBackgroundModifierSelected", "backgroundNestedFloating", "getBackgroundNestedFloating", "backgroundPrimary", "getBackgroundPrimary", "backgroundSecondary", "getBackgroundSecondary", "backgroundSecondaryAlt", "getBackgroundSecondaryAlt", "backgroundTertiary", "getBackgroundTertiary", "black", "getBlack", "bugReporterModalSubmittingBackground", "getBugReporterModalSubmittingBackground", "buttonDangerBackground", "getButtonDangerBackground", "buttonDangerBackgroundActive", "getButtonDangerBackgroundActive", "buttonDangerBackgroundDisabled", "getButtonDangerBackgroundDisabled", "buttonDangerBackgroundHover", "getButtonDangerBackgroundHover", "buttonOutlineBrandBackground", "getButtonOutlineBrandBackground", "buttonOutlineBrandBackgroundActive", "getButtonOutlineBrandBackgroundActive", "buttonOutlineBrandBackgroundHover", "getButtonOutlineBrandBackgroundHover", "buttonOutlineBrandBorder", "getButtonOutlineBrandBorder", "buttonOutlineBrandBorderActive", "getButtonOutlineBrandBorderActive", "buttonOutlineBrandBorderHover", "getButtonOutlineBrandBorderHover", "buttonOutlineBrandText", "getButtonOutlineBrandText", "buttonOutlineBrandTextActive", "getButtonOutlineBrandTextActive", "buttonOutlineBrandTextHover", "getButtonOutlineBrandTextHover", "buttonOutlineDangerBackground", "getButtonOutlineDangerBackground", "buttonOutlineDangerBackgroundActive", "getButtonOutlineDangerBackgroundActive", "buttonOutlineDangerBackgroundHover", "getButtonOutlineDangerBackgroundHover", "buttonOutlineDangerBorder", "getButtonOutlineDangerBorder", "buttonOutlineDangerBorderActive", "getButtonOutlineDangerBorderActive", "buttonOutlineDangerBorderHover", "getButtonOutlineDangerBorderHover", "buttonOutlineDangerText", "getButtonOutlineDangerText", "buttonOutlineDangerTextActive", "getButtonOutlineDangerTextActive", "buttonOutlineDangerTextHover", "getButtonOutlineDangerTextHover", "buttonOutlinePositiveBackground", "getButtonOutlinePositiveBackground", "buttonOutlinePositiveBackgroundActive", "getButtonOutlinePositiveBackgroundActive", "buttonOutlinePositiveBackgroundHover", "getButtonOutlinePositiveBackgroundHover", "buttonOutlinePositiveBorder", "getButtonOutlinePositiveBorder", "buttonOutlinePositiveBorderActive", "getButtonOutlinePositiveBorderActive", "buttonOutlinePositiveBorderHover", "getButtonOutlinePositiveBorderHover", "buttonOutlinePositiveText", "getButtonOutlinePositiveText", "buttonOutlinePositiveTextActive", "getButtonOutlinePositiveTextActive", "buttonOutlinePositiveTextHover", "getButtonOutlinePositiveTextHover", "buttonOutlinePrimaryBackground", "getButtonOutlinePrimaryBackground", "buttonOutlinePrimaryBackgroundActive", "getButtonOutlinePrimaryBackgroundActive", "buttonOutlinePrimaryBackgroundHover", "getButtonOutlinePrimaryBackgroundHover", "buttonOutlinePrimaryBorder", "getButtonOutlinePrimaryBorder", "buttonOutlinePrimaryBorderActive", "getButtonOutlinePrimaryBorderActive", "buttonOutlinePrimaryBorderHover", "getButtonOutlinePrimaryBorderHover", "buttonOutlinePrimaryText", "getButtonOutlinePrimaryText", "buttonOutlinePrimaryTextActive", "getButtonOutlinePrimaryTextActive", "buttonOutlinePrimaryTextHover", "getButtonOutlinePrimaryTextHover", "buttonPositiveBackground", "getButtonPositiveBackground", "buttonPositiveBackgroundActive", "getButtonPositiveBackgroundActive", "buttonPositiveBackgroundDisabled", "getButtonPositiveBackgroundDisabled", "buttonPositiveBackgroundHover", "getButtonPositiveBackgroundHover", "buttonSecondaryBackground", "getButtonSecondaryBackground", "buttonSecondaryBackgroundActive", "getButtonSecondaryBackgroundActive", "buttonSecondaryBackgroundDisabled", "getButtonSecondaryBackgroundDisabled", "buttonSecondaryBackgroundHover", "getButtonSecondaryBackgroundHover", "channelIcon", "getChannelIcon", "channelTextAreaPlaceholder", "getChannelTextAreaPlaceholder", "channelsDefault", "getChannelsDefault", "channeltextareaBackground", "getChanneltextareaBackground", "chatBackground", "getChatBackground", "chatBorder", "getChatBorder", "chatInputContainerBackground", "getChatInputContainerBackground", "controlBrandForeground", "getControlBrandForeground", "controlBrandForegroundNew", "getControlBrandForegroundNew", "deprecatedCardBg", "getDeprecatedCardBg", "deprecatedCardEditableBg", "getDeprecatedCardEditableBg", "deprecatedQuickswitcherInputBackground", "getDeprecatedQuickswitcherInputBackground", "deprecatedQuickswitcherInputPlaceholder", "getDeprecatedQuickswitcherInputPlaceholder", "deprecatedStoreBg", "getDeprecatedStoreBg", "deprecatedTextInputBg", "getDeprecatedTextInputBg", "deprecatedTextInputBorder", "getDeprecatedTextInputBorder", "deprecatedTextInputBorderDisabled", "getDeprecatedTextInputBorderDisabled", "deprecatedTextInputBorderHover", "getDeprecatedTextInputBorderHover", "deprecatedTextInputPrefix", "getDeprecatedTextInputPrefix", "displayBannerOverflowBackground", "getDisplayBannerOverflowBackground", "focusPrimary", "getFocusPrimary", "forumPostExtraMediaCountContainerBackground", "getForumPostExtraMediaCountContainerBackground", "forumPostTagBackground", "getForumPostTagBackground", "headerPrimary", "getHeaderPrimary", "headerSecondary", "getHeaderSecondary", "homeBackground", "getHomeBackground", "homeCardRestingBorder", "getHomeCardRestingBorder", "infoBoxBackground", "getInfoBoxBackground", "infoDangerBackground", "getInfoDangerBackground", "infoDangerForeground", "getInfoDangerForeground", "infoDangerText", "getInfoDangerText", "infoHelpBackground", "getInfoHelpBackground", "infoHelpForeground", "getInfoHelpForeground", "infoHelpText", "getInfoHelpText", "infoPositiveBackground", "getInfoPositiveBackground", "infoPositiveForeground", "getInfoPositiveForeground", "infoPositiveText", "getInfoPositiveText", "infoWarningBackground", "getInfoWarningBackground", "infoWarningForeground", "getInfoWarningForeground", "infoWarningText", "getInfoWarningText", "inputBackground", "getInputBackground", "inputPlaceholderText", "getInputPlaceholderText", "interactiveActive", "getInteractiveActive", "interactiveHover", "getInteractiveHover", "interactiveMuted", "getInteractiveMuted", "interactiveNormal", "getInteractiveNormal", "liveStageTileBorder", "getLiveStageTileBorder", "logoPrimary", "getLogoPrimary", "mentionBackground", "getMentionBackground", "mentionForeground", "getMentionForeground", "modalBackground", "getModalBackground", "modalFooterBackground", "getModalFooterBackground", "profileGradientMessageInputBorder", "getProfileGradientMessageInputBorder", "profileGradientNoteBackground", "getProfileGradientNoteBackground", "profileGradientOverlay", "getProfileGradientOverlay", "profileGradientOverlaySyncedWithUserTheme", "getProfileGradientOverlaySyncedWithUserTheme", "profileGradientProfileBodyBackgroundHover", "getProfileGradientProfileBodyBackgroundHover", "profileGradientRolePillBackground", "getProfileGradientRolePillBackground", "profileGradientRolePillBorder", "getProfileGradientRolePillBorder", "profileGradientSectionBox", "getProfileGradientSectionBox", "redesignButtonDangerBackground", "getRedesignButtonDangerBackground", "redesignButtonDangerPressedBackground", "getRedesignButtonDangerPressedBackground", "redesignButtonFloatingBackground", "getRedesignButtonFloatingBackground", "redesignButtonFloatingPressedBackground", "getRedesignButtonFloatingPressedBackground", "redesignButtonPositiveBackground", "getRedesignButtonPositiveBackground", "redesignButtonPositivePressedBackground", "getRedesignButtonPositivePressedBackground", "redesignButtonPrimaryBackground", "getRedesignButtonPrimaryBackground", "redesignButtonPrimaryPressedBackground", "getRedesignButtonPrimaryPressedBackground", "redesignButtonSecondaryBorder", "getRedesignButtonSecondaryBorder", "redesignButtonSecondaryPressedBackground", "getRedesignButtonSecondaryPressedBackground", "scrollbarAutoScrollbarColorThumb", "getScrollbarAutoScrollbarColorThumb", "scrollbarAutoScrollbarColorTrack", "getScrollbarAutoScrollbarColorTrack", "scrollbarAutoThumb", "getScrollbarAutoThumb", "scrollbarAutoTrack", "getScrollbarAutoTrack", "scrollbarThinThumb", "getScrollbarThinThumb", "scrollbarThinTrack", "getScrollbarThinTrack", "spoilerHiddenBackground", "getSpoilerHiddenBackground", "spoilerRevealedBackground", "getSpoilerRevealedBackground", "statusDanger", "getStatusDanger", "statusDangerBackground", "getStatusDangerBackground", "statusDangerText", "getStatusDangerText", "statusPositive", "getStatusPositive", "statusPositiveBackground", "getStatusPositiveBackground", "statusPositiveText", "getStatusPositiveText", "statusWarning", "getStatusWarning", "statusWarningBackground", "getStatusWarningBackground", "statusWarningText", "getStatusWarningText", "textBrand", "getTextBrand", "textDanger", "getTextDanger", "textLink", "getTextLink", "textLinkLowSaturation", "getTextLinkLowSaturation", "textMuted", "getTextMuted", "textNormal", "getTextNormal", "textPositive", "getTextPositive", "textWarning", "getTextWarning", "textboxMarkdownSyntax", "getTextboxMarkdownSyntax", "userProfileHeaderOverflowBackground", "getUserProfileHeaderOverflowBackground", "white", "getWhite", "getColor", "lightColor", "darkColor", "getColorRes", "lightColorRes", "darkColorRes", "theme_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class DarkTheme extends DiscordTheme {
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
    private final int backgroundModifierActive;
    private final int backgroundModifierHover;
    private final int backgroundModifierSelected;
    private final int backgroundNestedFloating;
    private final int backgroundPrimary;
    private final int backgroundSecondary;
    private final int backgroundSecondaryAlt;
    private final int backgroundTertiary;
    private final int black;
    private final int bugReporterModalSubmittingBackground;
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
    private final int focusPrimary;
    private final int forumPostExtraMediaCountContainerBackground;
    private final int forumPostTagBackground;
    private final int headerPrimary;
    private final int headerSecondary;
    private final int homeBackground;
    private final int homeCardRestingBorder;
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
    private final int redesignButtonDangerBackground;
    private final int redesignButtonDangerPressedBackground;
    private final int redesignButtonFloatingBackground;
    private final int redesignButtonFloatingPressedBackground;
    private final int redesignButtonPositiveBackground;
    private final int redesignButtonPositivePressedBackground;
    private final int redesignButtonPrimaryBackground;
    private final int redesignButtonPrimaryPressedBackground;
    private final int redesignButtonSecondaryBorder;
    private final int redesignButtonSecondaryPressedBackground;
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
    private final int textMuted;
    private final int textNormal;
    private final int textPositive;
    private final int textWarning;
    private final int textboxMarkdownSyntax;
    private final int userProfileHeaderOverflowBackground;
    private final int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkTheme(Context context) {
        super(null);
        C9971q.m14633g(context, "context");
        int i = C4744R.color.primary_700;
        this.activityCardBackground = ColorUtilsKt.getColorCompat(context, i);
        this.androidNavigationBarBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_830);
        this.androidNavigationScrimBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.android_navigation_scrim_background_dark);
        this.androidRipple = ColorUtilsKt.getColorCompat(context, C4744R.color.android_ripple_dark);
        this.backgroundAccent = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_530);
        this.backgroundFloating = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_800);
        this.backgroundMentioned = ColorUtilsKt.getColorCompat(context, C4744R.color.background_mentioned_dark);
        this.backgroundMentionedHover = ColorUtilsKt.getColorCompat(context, C4744R.color.background_mentioned_hover_dark);
        this.backgroundMessageAutomod = ColorUtilsKt.getColorCompat(context, C4744R.color.background_message_automod_dark);
        this.backgroundMessageAutomodHover = ColorUtilsKt.getColorCompat(context, C4744R.color.background_message_automod_hover_dark);
        this.backgroundMessageHighlight = ColorUtilsKt.getColorCompat(context, C4744R.color.background_message_highlight_dark);
        this.backgroundMessageHighlightHover = ColorUtilsKt.getColorCompat(context, C4744R.color.background_message_highlight_hover_dark);
        this.backgroundMessageHover = ColorUtilsKt.getColorCompat(context, C4744R.color.background_message_hover_dark);
        int i2 = C4744R.color.primary_600;
        this.backgroundMobilePrimary = ColorUtilsKt.getColorCompat(context, i2);
        int i3 = C4744R.color.primary_630;
        this.backgroundMobileSecondary = ColorUtilsKt.getColorCompat(context, i3);
        this.backgroundModifierAccent = ColorUtilsKt.getColorCompat(context, C4744R.color.background_modifier_accent_dark);
        this.backgroundModifierActive = ColorUtilsKt.getColorCompat(context, C4744R.color.background_modifier_active_dark);
        this.backgroundModifierHover = ColorUtilsKt.getColorCompat(context, C4744R.color.background_modifier_hover_dark);
        this.backgroundModifierSelected = ColorUtilsKt.getColorCompat(context, C4744R.color.background_modifier_selected_dark);
        this.backgroundNestedFloating = ColorUtilsKt.getColorCompat(context, i3);
        this.backgroundPrimary = ColorUtilsKt.getColorCompat(context, i2);
        this.backgroundSecondary = ColorUtilsKt.getColorCompat(context, i3);
        int i4 = C4744R.color.primary_660;
        this.backgroundSecondaryAlt = ColorUtilsKt.getColorCompat(context, i4);
        this.backgroundTertiary = ColorUtilsKt.getColorCompat(context, i);
        int i5 = C4744R.color.black_500;
        this.black = ColorUtilsKt.getColorCompat(context, i5);
        this.bugReporterModalSubmittingBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.bug_reporter_modal_submitting_background_dark);
        int i6 = C4744R.color.red_430;
        this.buttonDangerBackground = ColorUtilsKt.getColorCompat(context, i6);
        this.buttonDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, C4744R.color.red_530);
        this.buttonDangerBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i6);
        int i7 = C4744R.color.red_500;
        this.buttonDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, i7);
        this.buttonOutlineBrandBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.button_outline_brand_background_dark);
        int i8 = C4744R.color.brand_560;
        this.buttonOutlineBrandBackgroundActive = ColorUtilsKt.getColorCompat(context, i8);
        int i9 = C4744R.color.brand_500;
        this.buttonOutlineBrandBackgroundHover = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonOutlineBrandBorder = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonOutlineBrandBorderActive = ColorUtilsKt.getColorCompat(context, i8);
        this.buttonOutlineBrandBorderHover = ColorUtilsKt.getColorCompat(context, i9);
        int i10 = C4744R.color.white_500;
        this.buttonOutlineBrandText = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineBrandTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineBrandTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineDangerBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.button_outline_danger_background_dark);
        this.buttonOutlineDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, C4744R.color.red_460);
        this.buttonOutlineDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, i6);
        int i11 = C4744R.color.red_400;
        this.buttonOutlineDangerBorder = ColorUtilsKt.getColorCompat(context, i11);
        this.buttonOutlineDangerBorderActive = ColorUtilsKt.getColorCompat(context, i6);
        this.buttonOutlineDangerBorderHover = ColorUtilsKt.getColorCompat(context, i6);
        this.buttonOutlineDangerText = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineDangerTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineDangerTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePositiveBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.button_outline_positive_background_dark);
        int i12 = C4744R.color.green_530;
        this.buttonOutlinePositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i12);
        int i13 = C4744R.color.green_430;
        this.buttonOutlinePositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i13);
        int i14 = C4744R.color.green_360;
        this.buttonOutlinePositiveBorder = ColorUtilsKt.getColorCompat(context, i14);
        this.buttonOutlinePositiveBorderActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePositiveBorderHover = ColorUtilsKt.getColorCompat(context, i13);
        this.buttonOutlinePositiveText = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePositiveTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePositiveTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePrimaryBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.button_outline_primary_background_dark);
        int i15 = C4744R.color.primary_430;
        this.buttonOutlinePrimaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i15);
        int i16 = C4744R.color.primary_500;
        this.buttonOutlinePrimaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePrimaryBorder = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePrimaryBorderActive = ColorUtilsKt.getColorCompat(context, i15);
        this.buttonOutlinePrimaryBorderHover = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePrimaryText = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePrimaryTextActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlinePrimaryTextHover = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonPositiveBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.buttonPositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonPositiveBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i13);
        int i17 = C4744R.color.green_500;
        this.buttonPositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonSecondaryBackground = ColorUtilsKt.getColorCompat(context, i16);
        int i18 = C4744R.color.primary_400;
        this.buttonSecondaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i18);
        this.buttonSecondaryBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonSecondaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i15);
        this.channelIcon = ColorUtilsKt.getColorCompat(context, i18);
        this.channelTextAreaPlaceholder = ColorUtilsKt.getColorCompat(context, i15);
        int i19 = C4744R.color.primary_360;
        this.channelsDefault = ColorUtilsKt.getColorCompat(context, i19);
        this.channeltextareaBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_560);
        this.chatBackground = ColorUtilsKt.getColorCompat(context, i2);
        this.chatBorder = ColorUtilsKt.getColorCompat(context, i);
        this.chatInputContainerBackground = ColorUtilsKt.getColorCompat(context, i2);
        int i20 = C4744R.color.brand_360;
        this.controlBrandForeground = ColorUtilsKt.getColorCompat(context, i20);
        this.controlBrandForegroundNew = ColorUtilsKt.getColorCompat(context, i20);
        this.deprecatedCardBg = ColorUtilsKt.getColorCompat(context, C4744R.color.deprecated_card_bg_dark);
        this.deprecatedCardEditableBg = ColorUtilsKt.getColorCompat(context, C4744R.color.deprecated_card_editable_bg_dark);
        this.deprecatedQuickswitcherInputBackground = ColorUtilsKt.getColorCompat(context, i18);
        this.deprecatedQuickswitcherInputPlaceholder = ColorUtilsKt.getColorCompat(context, C4744R.color.deprecated_quickswitcher_input_placeholder_dark);
        this.deprecatedStoreBg = ColorUtilsKt.getColorCompat(context, i2);
        this.deprecatedTextInputBg = ColorUtilsKt.getColorCompat(context, i);
        this.deprecatedTextInputBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.deprecated_text_input_border_dark);
        this.deprecatedTextInputBorderDisabled = ColorUtilsKt.getColorCompat(context, i);
        this.deprecatedTextInputBorderHover = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_900);
        this.deprecatedTextInputPrefix = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_200);
        this.displayBannerOverflowBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.display_banner_overflow_background_dark);
        int i21 = C4744R.color.blue_345;
        this.focusPrimary = ColorUtilsKt.getColorCompat(context, i21);
        this.forumPostExtraMediaCountContainerBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.forum_post_extra_media_count_container_background_dark);
        this.forumPostTagBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.forum_post_tag_background_dark);
        this.headerPrimary = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_130);
        int i22 = C4744R.color.primary_330;
        this.headerSecondary = ColorUtilsKt.getColorCompat(context, i22);
        this.homeBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.primary_645);
        this.homeCardRestingBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.home_card_resting_border_dark);
        this.infoBoxBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.info_box_background_dark);
        this.infoDangerBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.info_danger_background_dark);
        this.infoDangerForeground = ColorUtilsKt.getColorCompat(context, i11);
        this.infoDangerText = ColorUtilsKt.getColorCompat(context, i10);
        this.infoHelpBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.info_help_background_dark);
        this.infoHelpForeground = ColorUtilsKt.getColorCompat(context, i21);
        this.infoHelpText = ColorUtilsKt.getColorCompat(context, i10);
        this.infoPositiveBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.info_positive_background_dark);
        this.infoPositiveForeground = ColorUtilsKt.getColorCompat(context, i14);
        this.infoPositiveText = ColorUtilsKt.getColorCompat(context, i10);
        this.infoWarningBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.info_warning_background_dark);
        int i23 = C4744R.color.yellow_300;
        this.infoWarningForeground = ColorUtilsKt.getColorCompat(context, i23);
        this.infoWarningText = ColorUtilsKt.getColorCompat(context, i10);
        this.inputBackground = ColorUtilsKt.getColorCompat(context, i);
        this.inputPlaceholderText = ColorUtilsKt.getColorCompat(context, C4744R.color.input_placeholder_text_dark);
        this.interactiveActive = ColorUtilsKt.getColorCompat(context, i10);
        int i24 = C4744R.color.primary_230;
        this.interactiveHover = ColorUtilsKt.getColorCompat(context, i24);
        this.interactiveMuted = ColorUtilsKt.getColorCompat(context, i16);
        this.interactiveNormal = ColorUtilsKt.getColorCompat(context, i22);
        this.liveStageTileBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.live_stage_tile_border_dark);
        this.logoPrimary = ColorUtilsKt.getColorCompat(context, i10);
        this.mentionBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.mention_background_dark);
        this.mentionForeground = ColorUtilsKt.getColorCompat(context, C4744R.color.brand_260);
        this.modalBackground = ColorUtilsKt.getColorCompat(context, i2);
        this.modalFooterBackground = ColorUtilsKt.getColorCompat(context, i3);
        this.profileGradientMessageInputBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_message_input_border_dark);
        this.profileGradientNoteBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_note_background_dark);
        this.profileGradientOverlay = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_overlay_dark);
        this.profileGradientOverlaySyncedWithUserTheme = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_overlay_synced_with_user_theme_dark);
        this.profileGradientProfileBodyBackgroundHover = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_profile_body_background_hover_dark);
        this.profileGradientRolePillBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_role_pill_background_dark);
        this.profileGradientRolePillBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_role_pill_border_dark);
        this.profileGradientSectionBox = ColorUtilsKt.getColorCompat(context, C4744R.color.profile_gradient_section_box_dark);
        this.redesignButtonDangerBackground = ColorUtilsKt.getColorCompat(context, i6);
        this.redesignButtonDangerPressedBackground = ColorUtilsKt.getColorCompat(context, i7);
        this.redesignButtonFloatingBackground = ColorUtilsKt.getColorCompat(context, i10);
        int i25 = C4744R.color.primary_730;
        this.redesignButtonFloatingPressedBackground = ColorUtilsKt.getColorCompat(context, i25);
        this.redesignButtonPositiveBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.redesignButtonPositivePressedBackground = ColorUtilsKt.getColorCompat(context, i17);
        this.redesignButtonPrimaryBackground = ColorUtilsKt.getColorCompat(context, i9);
        this.redesignButtonPrimaryPressedBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.brand_600);
        this.redesignButtonSecondaryBorder = ColorUtilsKt.getColorCompat(context, C4744R.color.redesign_button_secondary_border_dark);
        this.redesignButtonSecondaryPressedBackground = ColorUtilsKt.getColorCompat(context, i);
        this.scrollbarAutoScrollbarColorThumb = ColorUtilsKt.getColorCompat(context, i25);
        this.scrollbarAutoScrollbarColorTrack = ColorUtilsKt.getColorCompat(context, i3);
        this.scrollbarAutoThumb = ColorUtilsKt.getColorCompat(context, i25);
        this.scrollbarAutoTrack = ColorUtilsKt.getColorCompat(context, i3);
        this.scrollbarThinThumb = ColorUtilsKt.getColorCompat(context, i25);
        this.scrollbarThinTrack = ColorUtilsKt.getColorCompat(context, C4744R.color.scrollbar_thin_track_dark);
        this.spoilerHiddenBackground = ColorUtilsKt.getColorCompat(context, i);
        this.spoilerRevealedBackground = ColorUtilsKt.getColorCompat(context, i4);
        this.statusDanger = ColorUtilsKt.getColorCompat(context, i11);
        this.statusDangerBackground = ColorUtilsKt.getColorCompat(context, i11);
        this.statusDangerText = ColorUtilsKt.getColorCompat(context, i10);
        this.statusPositive = ColorUtilsKt.getColorCompat(context, i14);
        this.statusPositiveBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.statusPositiveText = ColorUtilsKt.getColorCompat(context, i10);
        this.statusWarning = ColorUtilsKt.getColorCompat(context, i23);
        this.statusWarningBackground = ColorUtilsKt.getColorCompat(context, i23);
        this.statusWarningText = ColorUtilsKt.getColorCompat(context, i5);
        this.textBrand = ColorUtilsKt.getColorCompat(context, i20);
        this.textDanger = ColorUtilsKt.getColorCompat(context, C4744R.color.red_345);
        this.textLink = ColorUtilsKt.getColorCompat(context, i21);
        this.textLinkLowSaturation = ColorUtilsKt.getColorCompat(context, C4744R.color.blue_330);
        this.textMuted = ColorUtilsKt.getColorCompat(context, i19);
        this.textNormal = ColorUtilsKt.getColorCompat(context, i24);
        this.textPositive = ColorUtilsKt.getColorCompat(context, C4744R.color.green_330);
        this.textWarning = ColorUtilsKt.getColorCompat(context, i23);
        this.textboxMarkdownSyntax = ColorUtilsKt.getColorCompat(context, i19);
        this.userProfileHeaderOverflowBackground = ColorUtilsKt.getColorCompat(context, C4744R.color.user_profile_header_overflow_background_dark);
        this.white = ColorUtilsKt.getColorCompat(context, i10);
    }

    @Override // com.discord.theme.DiscordTheme
    public int getActivityCardBackground() {
        return this.activityCardBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidNavigationBarBackground() {
        return this.androidNavigationBarBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidNavigationScrimBackground() {
        return this.androidNavigationScrimBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidRipple() {
        return this.androidRipple;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundAccent() {
        return this.backgroundAccent;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundFloating() {
        return this.backgroundFloating;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMentioned() {
        return this.backgroundMentioned;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMentionedHover() {
        return this.backgroundMentionedHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageAutomod() {
        return this.backgroundMessageAutomod;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageAutomodHover() {
        return this.backgroundMessageAutomodHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHighlight() {
        return this.backgroundMessageHighlight;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHighlightHover() {
        return this.backgroundMessageHighlightHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHover() {
        return this.backgroundMessageHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMobilePrimary() {
        return this.backgroundMobilePrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMobileSecondary() {
        return this.backgroundMobileSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierAccent() {
        return this.backgroundModifierAccent;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierActive() {
        return this.backgroundModifierActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierHover() {
        return this.backgroundModifierHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierSelected() {
        return this.backgroundModifierSelected;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundNestedFloating() {
        return this.backgroundNestedFloating;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundPrimary() {
        return this.backgroundPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundSecondary() {
        return this.backgroundSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundSecondaryAlt() {
        return this.backgroundSecondaryAlt;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundTertiary() {
        return this.backgroundTertiary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBlack() {
        return this.black;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBugReporterModalSubmittingBackground() {
        return this.bugReporterModalSubmittingBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackground() {
        return this.buttonDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundActive() {
        return this.buttonDangerBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundDisabled() {
        return this.buttonDangerBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundHover() {
        return this.buttonDangerBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackground() {
        return this.buttonOutlineBrandBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackgroundActive() {
        return this.buttonOutlineBrandBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackgroundHover() {
        return this.buttonOutlineBrandBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorder() {
        return this.buttonOutlineBrandBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorderActive() {
        return this.buttonOutlineBrandBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorderHover() {
        return this.buttonOutlineBrandBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandText() {
        return this.buttonOutlineBrandText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandTextActive() {
        return this.buttonOutlineBrandTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandTextHover() {
        return this.buttonOutlineBrandTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackground() {
        return this.buttonOutlineDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackgroundActive() {
        return this.buttonOutlineDangerBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackgroundHover() {
        return this.buttonOutlineDangerBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorder() {
        return this.buttonOutlineDangerBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorderActive() {
        return this.buttonOutlineDangerBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorderHover() {
        return this.buttonOutlineDangerBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerText() {
        return this.buttonOutlineDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerTextActive() {
        return this.buttonOutlineDangerTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerTextHover() {
        return this.buttonOutlineDangerTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackground() {
        return this.buttonOutlinePositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackgroundActive() {
        return this.buttonOutlinePositiveBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackgroundHover() {
        return this.buttonOutlinePositiveBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorder() {
        return this.buttonOutlinePositiveBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorderActive() {
        return this.buttonOutlinePositiveBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorderHover() {
        return this.buttonOutlinePositiveBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveText() {
        return this.buttonOutlinePositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveTextActive() {
        return this.buttonOutlinePositiveTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveTextHover() {
        return this.buttonOutlinePositiveTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackground() {
        return this.buttonOutlinePrimaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackgroundActive() {
        return this.buttonOutlinePrimaryBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackgroundHover() {
        return this.buttonOutlinePrimaryBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorder() {
        return this.buttonOutlinePrimaryBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorderActive() {
        return this.buttonOutlinePrimaryBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorderHover() {
        return this.buttonOutlinePrimaryBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryText() {
        return this.buttonOutlinePrimaryText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryTextActive() {
        return this.buttonOutlinePrimaryTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryTextHover() {
        return this.buttonOutlinePrimaryTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackground() {
        return this.buttonPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundActive() {
        return this.buttonPositiveBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundDisabled() {
        return this.buttonPositiveBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundHover() {
        return this.buttonPositiveBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackground() {
        return this.buttonSecondaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundActive() {
        return this.buttonSecondaryBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundDisabled() {
        return this.buttonSecondaryBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundHover() {
        return this.buttonSecondaryBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelIcon() {
        return this.channelIcon;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelTextAreaPlaceholder() {
        return this.channelTextAreaPlaceholder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelsDefault() {
        return this.channelsDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChanneltextareaBackground() {
        return this.channeltextareaBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatBackground() {
        return this.chatBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatBorder() {
        return this.chatBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatInputContainerBackground() {
        return this.chatInputContainerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getColor(int i, int i2) {
        return i2;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getColorRes(int i, int i2) {
        return i2;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getControlBrandForeground() {
        return this.controlBrandForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getControlBrandForegroundNew() {
        return this.controlBrandForegroundNew;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedCardBg() {
        return this.deprecatedCardBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedCardEditableBg() {
        return this.deprecatedCardEditableBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedQuickswitcherInputBackground() {
        return this.deprecatedQuickswitcherInputBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedQuickswitcherInputPlaceholder() {
        return this.deprecatedQuickswitcherInputPlaceholder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedStoreBg() {
        return this.deprecatedStoreBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBg() {
        return this.deprecatedTextInputBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorder() {
        return this.deprecatedTextInputBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorderDisabled() {
        return this.deprecatedTextInputBorderDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorderHover() {
        return this.deprecatedTextInputBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputPrefix() {
        return this.deprecatedTextInputPrefix;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDisplayBannerOverflowBackground() {
        return this.displayBannerOverflowBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getFocusPrimary() {
        return this.focusPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getForumPostExtraMediaCountContainerBackground() {
        return this.forumPostExtraMediaCountContainerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getForumPostTagBackground() {
        return this.forumPostTagBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHeaderPrimary() {
        return this.headerPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHeaderSecondary() {
        return this.headerSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHomeBackground() {
        return this.homeBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHomeCardRestingBorder() {
        return this.homeCardRestingBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoBoxBackground() {
        return this.infoBoxBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerBackground() {
        return this.infoDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerForeground() {
        return this.infoDangerForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerText() {
        return this.infoDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpBackground() {
        return this.infoHelpBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpForeground() {
        return this.infoHelpForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpText() {
        return this.infoHelpText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveBackground() {
        return this.infoPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveForeground() {
        return this.infoPositiveForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveText() {
        return this.infoPositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningBackground() {
        return this.infoWarningBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningForeground() {
        return this.infoWarningForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningText() {
        return this.infoWarningText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInputBackground() {
        return this.inputBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInputPlaceholderText() {
        return this.inputPlaceholderText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveActive() {
        return this.interactiveActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveHover() {
        return this.interactiveHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveMuted() {
        return this.interactiveMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveNormal() {
        return this.interactiveNormal;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLiveStageTileBorder() {
        return this.liveStageTileBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLogoPrimary() {
        return this.logoPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getMentionBackground() {
        return this.mentionBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getMentionForeground() {
        return this.mentionForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getModalBackground() {
        return this.modalBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getModalFooterBackground() {
        return this.modalFooterBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientMessageInputBorder() {
        return this.profileGradientMessageInputBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientNoteBackground() {
        return this.profileGradientNoteBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientOverlay() {
        return this.profileGradientOverlay;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientOverlaySyncedWithUserTheme() {
        return this.profileGradientOverlaySyncedWithUserTheme;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientProfileBodyBackgroundHover() {
        return this.profileGradientProfileBodyBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientRolePillBackground() {
        return this.profileGradientRolePillBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientRolePillBorder() {
        return this.profileGradientRolePillBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientSectionBox() {
        return this.profileGradientSectionBox;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonDangerBackground() {
        return this.redesignButtonDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonDangerPressedBackground() {
        return this.redesignButtonDangerPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonFloatingBackground() {
        return this.redesignButtonFloatingBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonFloatingPressedBackground() {
        return this.redesignButtonFloatingPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPositiveBackground() {
        return this.redesignButtonPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPositivePressedBackground() {
        return this.redesignButtonPositivePressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryBackground() {
        return this.redesignButtonPrimaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryPressedBackground() {
        return this.redesignButtonPrimaryPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryBorder() {
        return this.redesignButtonSecondaryBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryPressedBackground() {
        return this.redesignButtonSecondaryPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoScrollbarColorThumb() {
        return this.scrollbarAutoScrollbarColorThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoScrollbarColorTrack() {
        return this.scrollbarAutoScrollbarColorTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoThumb() {
        return this.scrollbarAutoThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoTrack() {
        return this.scrollbarAutoTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarThinThumb() {
        return this.scrollbarThinThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarThinTrack() {
        return this.scrollbarThinTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getSpoilerHiddenBackground() {
        return this.spoilerHiddenBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getSpoilerRevealedBackground() {
        return this.spoilerRevealedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDanger() {
        return this.statusDanger;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDangerBackground() {
        return this.statusDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDangerText() {
        return this.statusDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositive() {
        return this.statusPositive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositiveBackground() {
        return this.statusPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositiveText() {
        return this.statusPositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarning() {
        return this.statusWarning;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarningBackground() {
        return this.statusWarningBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarningText() {
        return this.statusWarningText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextBrand() {
        return this.textBrand;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextDanger() {
        return this.textDanger;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextLink() {
        return this.textLink;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextLinkLowSaturation() {
        return this.textLinkLowSaturation;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextMuted() {
        return this.textMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextNormal() {
        return this.textNormal;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextPositive() {
        return this.textPositive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextWarning() {
        return this.textWarning;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextboxMarkdownSyntax() {
        return this.textboxMarkdownSyntax;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getUserProfileHeaderOverflowBackground() {
        return this.userProfileHeaderOverflowBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getWhite() {
        return this.white;
    }
}
