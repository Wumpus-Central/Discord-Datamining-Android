package com.horcrux.svg;

import android.view.View;
import com.discord.span.utilities.spannable.BulletSpan;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGCircleManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGDefsManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGGroupManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;
import com.facebook.react.viewmanagers.RNSVGImageManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLineManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPatternManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGUseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: classes6.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class CircleViewManager extends RenderableViewManager<C5947b> implements RNSVGCircleManagerInterface<C5947b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        /* JADX INFO: Access modifiers changed from: package-private */
        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new RNSVGCircleManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5947b bVar, String str) {
            super.setClipPath((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5947b bVar, int i) {
            super.setClipRule((CircleViewManager) bVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5947b bVar, String str) {
            super.setDisplay((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5947b bVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((CircleViewManager) bVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5947b bVar, float f) {
            RenderableViewManager.super.setFillOpacity((CircleViewManager) bVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5947b bVar, int i) {
            RenderableViewManager.super.setFillRule((CircleViewManager) bVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5947b bVar, String str) {
            super.setMarkerEnd((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5947b bVar, String str) {
            super.setMarkerMid((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5947b bVar, String str) {
            super.setMarkerStart((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5947b bVar, String str) {
            super.setMask((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5947b bVar, ReadableArray readableArray) {
            super.setMatrix((CircleViewManager) bVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5947b bVar, String str) {
            super.setName((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((CircleViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5947b bVar, String str) {
            super.setPointerEvents((CircleViewManager) bVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5947b bVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((CircleViewManager) bVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5947b bVar, boolean z) {
            super.setResponsible((CircleViewManager) bVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5947b bVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((CircleViewManager) bVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5947b bVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((CircleViewManager) bVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5947b bVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((CircleViewManager) bVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5947b bVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((CircleViewManager) bVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5947b bVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((CircleViewManager) bVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5947b bVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((CircleViewManager) bVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5947b bVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((CircleViewManager) bVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5947b bVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((CircleViewManager) bVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5947b bVar, int i) {
            RenderableViewManager.super.setVectorEffect((CircleViewManager) bVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5947b bVar, String str) {
            RenderableViewManager.super.setStrokeWidth((CircleViewManager) bVar, str);
        }

        @ReactProp(name = "cx")
        public void setCx(C5947b bVar, Dynamic dynamic) {
            bVar.m26834a(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5947b bVar, Dynamic dynamic) {
            bVar.m26831d(dynamic);
        }

        @ReactProp(name = "r")
        public void setR(C5947b bVar, Dynamic dynamic) {
            bVar.m26828g(dynamic);
        }

        public void setCx(C5947b bVar, String str) {
            bVar.m26832c(str);
        }

        public void setCy(C5947b bVar, String str) {
            bVar.m26829f(str);
        }

        public void setR(C5947b bVar, String str) {
            bVar.m26826i(str);
        }

        public void setCx(C5947b bVar, Double d) {
            bVar.m26833b(d);
        }

        public void setCy(C5947b bVar, Double d) {
            bVar.m26830e(d);
        }

        public void setR(C5947b bVar, Double d) {
            bVar.m26827h(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ClipPathViewManager extends GroupViewManagerAbstract<C5949c> implements RNSVGClipPathManagerInterface<C5949c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        /* JADX INFO: Access modifiers changed from: package-private */
        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new RNSVGClipPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5949c cVar, String str) {
            super.setClipPath((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5949c cVar, int i) {
            super.setClipRule((ClipPathViewManager) cVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5949c cVar, String str) {
            super.setDisplay((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5949c cVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((ClipPathViewManager) cVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5949c cVar, float f) {
            RenderableViewManager.super.setFillOpacity((ClipPathViewManager) cVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5949c cVar, int i) {
            RenderableViewManager.super.setFillRule((ClipPathViewManager) cVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5949c cVar, ReadableMap readableMap) {
            super.setFont((ClipPathViewManager) cVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5949c cVar, Double d) {
            super.setFontSize((ClipPathViewManager) cVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5949c cVar, Double d) {
            super.setFontWeight((ClipPathViewManager) cVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5949c cVar, String str) {
            super.setMarkerEnd((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5949c cVar, String str) {
            super.setMarkerMid((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5949c cVar, String str) {
            super.setMarkerStart((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5949c cVar, String str) {
            super.setMask((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5949c cVar, ReadableArray readableArray) {
            super.setMatrix((ClipPathViewManager) cVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5949c cVar, String str) {
            super.setName((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ClipPathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5949c cVar, String str) {
            super.setPointerEvents((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5949c cVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((ClipPathViewManager) cVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5949c cVar, boolean z) {
            super.setResponsible((ClipPathViewManager) cVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5949c cVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((ClipPathViewManager) cVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5949c cVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((ClipPathViewManager) cVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5949c cVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((ClipPathViewManager) cVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5949c cVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((ClipPathViewManager) cVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5949c cVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((ClipPathViewManager) cVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5949c cVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((ClipPathViewManager) cVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5949c cVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((ClipPathViewManager) cVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5949c cVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((ClipPathViewManager) cVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5949c cVar, int i) {
            RenderableViewManager.super.setVectorEffect((ClipPathViewManager) cVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5949c cVar, String str) {
            super.setFontSize((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5949c cVar, String str) {
            super.setFontWeight((ClipPathViewManager) cVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5949c cVar, String str) {
            RenderableViewManager.super.setStrokeWidth((ClipPathViewManager) cVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class DefsViewManager extends VirtualViewManager<C5953e> implements RNSVGDefsManagerInterface<C5953e> {
        public static final String REACT_CLASS = "RNSVGDefs";

        /* JADX INFO: Access modifiers changed from: package-private */
        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new RNSVGDefsManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5953e eVar, String str) {
            super.setClipPath((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5953e eVar, int i) {
            super.setClipRule((DefsViewManager) eVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5953e eVar, String str) {
            super.setDisplay((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5953e eVar, String str) {
            super.setMarkerEnd((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5953e eVar, String str) {
            super.setMarkerMid((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5953e eVar, String str) {
            super.setMarkerStart((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5953e eVar, String str) {
            super.setMask((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5953e eVar, ReadableArray readableArray) {
            super.setMatrix((DefsViewManager) eVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5953e eVar, String str) {
            super.setName((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((DefsViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5953e eVar, String str) {
            super.setPointerEvents((DefsViewManager) eVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5953e eVar, boolean z) {
            super.setResponsible((DefsViewManager) eVar, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class EllipseViewManager extends RenderableViewManager<C5957g> implements RNSVGEllipseManagerInterface<C5957g> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        /* JADX INFO: Access modifiers changed from: package-private */
        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new RNSVGEllipseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5957g gVar, String str) {
            super.setClipPath((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5957g gVar, int i) {
            super.setClipRule((EllipseViewManager) gVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5957g gVar, String str) {
            super.setDisplay((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5957g gVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((EllipseViewManager) gVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5957g gVar, float f) {
            RenderableViewManager.super.setFillOpacity((EllipseViewManager) gVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5957g gVar, int i) {
            RenderableViewManager.super.setFillRule((EllipseViewManager) gVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5957g gVar, String str) {
            super.setMarkerEnd((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5957g gVar, String str) {
            super.setMarkerMid((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5957g gVar, String str) {
            super.setMarkerStart((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5957g gVar, String str) {
            super.setMask((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5957g gVar, ReadableArray readableArray) {
            super.setMatrix((EllipseViewManager) gVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5957g gVar, String str) {
            super.setName((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((EllipseViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5957g gVar, String str) {
            super.setPointerEvents((EllipseViewManager) gVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5957g gVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((EllipseViewManager) gVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5957g gVar, boolean z) {
            super.setResponsible((EllipseViewManager) gVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5957g gVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((EllipseViewManager) gVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5957g gVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((EllipseViewManager) gVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5957g gVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((EllipseViewManager) gVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5957g gVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((EllipseViewManager) gVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5957g gVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((EllipseViewManager) gVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5957g gVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((EllipseViewManager) gVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5957g gVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((EllipseViewManager) gVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5957g gVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((EllipseViewManager) gVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5957g gVar, int i) {
            RenderableViewManager.super.setVectorEffect((EllipseViewManager) gVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5957g gVar, String str) {
            RenderableViewManager.super.setStrokeWidth((EllipseViewManager) gVar, str);
        }

        @ReactProp(name = "cx")
        public void setCx(C5957g gVar, Dynamic dynamic) {
            gVar.m26804a(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5957g gVar, Dynamic dynamic) {
            gVar.m26801d(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5957g gVar, Dynamic dynamic) {
            gVar.m26798g(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5957g gVar, Dynamic dynamic) {
            gVar.m26795j(dynamic);
        }

        public void setCx(C5957g gVar, String str) {
            gVar.m26802c(str);
        }

        public void setCy(C5957g gVar, String str) {
            gVar.m26799f(str);
        }

        public void setRx(C5957g gVar, String str) {
            gVar.m26796i(str);
        }

        public void setRy(C5957g gVar, String str) {
            gVar.m26793l(str);
        }

        public void setCx(C5957g gVar, Double d) {
            gVar.m26803b(d);
        }

        public void setCy(C5957g gVar, Double d) {
            gVar.m26800e(d);
        }

        public void setRx(C5957g gVar, Double d) {
            gVar.m26797h(d);
        }

        public void setRy(C5957g gVar, Double d) {
            gVar.m26794k(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ForeignObjectManager extends GroupViewManagerAbstract<C5963i> implements RNSVGForeignObjectManagerInterface<C5963i> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        /* JADX INFO: Access modifiers changed from: package-private */
        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new RNSVGForeignObjectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5963i iVar, String str) {
            super.setClipPath((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5963i iVar, int i) {
            super.setClipRule((ForeignObjectManager) iVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5963i iVar, String str) {
            super.setDisplay((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5963i iVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((ForeignObjectManager) iVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5963i iVar, float f) {
            RenderableViewManager.super.setFillOpacity((ForeignObjectManager) iVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5963i iVar, int i) {
            RenderableViewManager.super.setFillRule((ForeignObjectManager) iVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5963i iVar, ReadableMap readableMap) {
            super.setFont((ForeignObjectManager) iVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5963i iVar, Double d) {
            super.setFontSize((ForeignObjectManager) iVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5963i iVar, Double d) {
            super.setFontWeight((ForeignObjectManager) iVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5963i iVar, String str) {
            super.setMarkerEnd((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5963i iVar, String str) {
            super.setMarkerMid((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5963i iVar, String str) {
            super.setMarkerStart((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5963i iVar, String str) {
            super.setMask((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5963i iVar, ReadableArray readableArray) {
            super.setMatrix((ForeignObjectManager) iVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5963i iVar, String str) {
            super.setName((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ForeignObjectManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5963i iVar, String str) {
            super.setPointerEvents((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5963i iVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((ForeignObjectManager) iVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5963i iVar, boolean z) {
            super.setResponsible((ForeignObjectManager) iVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5963i iVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((ForeignObjectManager) iVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5963i iVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((ForeignObjectManager) iVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5963i iVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((ForeignObjectManager) iVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5963i iVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((ForeignObjectManager) iVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5963i iVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((ForeignObjectManager) iVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5963i iVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((ForeignObjectManager) iVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5963i iVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((ForeignObjectManager) iVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5963i iVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((ForeignObjectManager) iVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5963i iVar, int i) {
            RenderableViewManager.super.setVectorEffect((ForeignObjectManager) iVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5963i iVar, String str) {
            super.setFontSize((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5963i iVar, String str) {
            super.setFontWeight((ForeignObjectManager) iVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5963i iVar, String str) {
            RenderableViewManager.super.setStrokeWidth((ForeignObjectManager) iVar, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5963i iVar, Dynamic dynamic) {
            iVar.m26764k(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5963i iVar, Dynamic dynamic) {
            iVar.m26761n(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5963i iVar, Dynamic dynamic) {
            iVar.m26758q(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5963i iVar, Dynamic dynamic) {
            iVar.m26755t(dynamic);
        }

        public void setHeight(C5963i iVar, String str) {
            iVar.m26762m(str);
        }

        public void setWidth(C5963i iVar, String str) {
            iVar.m26759p(str);
        }

        public void setX(C5963i iVar, String str) {
            iVar.m26756s(str);
        }

        public void setY(C5963i iVar, String str) {
            iVar.m26753v(str);
        }

        public void setHeight(C5963i iVar, Double d) {
            iVar.m26763l(d);
        }

        public void setWidth(C5963i iVar, Double d) {
            iVar.m26760o(d);
        }

        public void setX(C5963i iVar, Double d) {
            iVar.m26757r(d);
        }

        public void setY(C5963i iVar, Double d) {
            iVar.m26754u(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class GroupViewManager extends GroupViewManagerAbstract<C5969l> implements RNSVGGroupManagerInterface<C5969l> {
        public static final String REACT_CLASS = "RNSVGGroup";

        /* JADX INFO: Access modifiers changed from: package-private */
        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new RNSVGGroupManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5969l lVar, String str) {
            super.setClipPath((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5969l lVar, int i) {
            super.setClipRule((GroupViewManager) lVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5969l lVar, String str) {
            super.setDisplay((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5969l lVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((GroupViewManager) lVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5969l lVar, float f) {
            RenderableViewManager.super.setFillOpacity((GroupViewManager) lVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5969l lVar, int i) {
            RenderableViewManager.super.setFillRule((GroupViewManager) lVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5969l lVar, ReadableMap readableMap) {
            super.setFont((GroupViewManager) lVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5969l lVar, Double d) {
            super.setFontSize((GroupViewManager) lVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5969l lVar, Double d) {
            super.setFontWeight((GroupViewManager) lVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5969l lVar, String str) {
            super.setMarkerEnd((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5969l lVar, String str) {
            super.setMarkerMid((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5969l lVar, String str) {
            super.setMarkerStart((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5969l lVar, String str) {
            super.setMask((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5969l lVar, ReadableArray readableArray) {
            super.setMatrix((GroupViewManager) lVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5969l lVar, String str) {
            super.setName((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((GroupViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5969l lVar, String str) {
            super.setPointerEvents((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5969l lVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((GroupViewManager) lVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5969l lVar, boolean z) {
            super.setResponsible((GroupViewManager) lVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5969l lVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((GroupViewManager) lVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5969l lVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((GroupViewManager) lVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5969l lVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((GroupViewManager) lVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5969l lVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((GroupViewManager) lVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5969l lVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((GroupViewManager) lVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5969l lVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((GroupViewManager) lVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5969l lVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((GroupViewManager) lVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5969l lVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((GroupViewManager) lVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5969l lVar, int i) {
            RenderableViewManager.super.setVectorEffect((GroupViewManager) lVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5969l lVar, String str) {
            super.setFontSize((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5969l lVar, String str) {
            super.setFontWeight((GroupViewManager) lVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5969l lVar, String str) {
            RenderableViewManager.super.setStrokeWidth((GroupViewManager) lVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ImageViewManager extends RenderableViewManager<C5971m> implements RNSVGImageManagerInterface<C5971m> {
        public static final String REACT_CLASS = "RNSVGImage";

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new RNSVGImageManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5971m mVar, String str) {
            super.setClipPath((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5971m mVar, int i) {
            super.setClipRule((ImageViewManager) mVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5971m mVar, String str) {
            super.setDisplay((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5971m mVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((ImageViewManager) mVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5971m mVar, float f) {
            RenderableViewManager.super.setFillOpacity((ImageViewManager) mVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5971m mVar, int i) {
            RenderableViewManager.super.setFillRule((ImageViewManager) mVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5971m mVar, String str) {
            super.setMarkerEnd((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5971m mVar, String str) {
            super.setMarkerMid((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5971m mVar, String str) {
            super.setMarkerStart((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5971m mVar, String str) {
            super.setMask((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5971m mVar, ReadableArray readableArray) {
            super.setMatrix((ImageViewManager) mVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5971m mVar, String str) {
            super.setName((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ImageViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5971m mVar, String str) {
            super.setPointerEvents((ImageViewManager) mVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5971m mVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((ImageViewManager) mVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5971m mVar, boolean z) {
            super.setResponsible((ImageViewManager) mVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5971m mVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((ImageViewManager) mVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5971m mVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((ImageViewManager) mVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5971m mVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((ImageViewManager) mVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5971m mVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((ImageViewManager) mVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5971m mVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((ImageViewManager) mVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5971m mVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((ImageViewManager) mVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5971m mVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((ImageViewManager) mVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5971m mVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((ImageViewManager) mVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5971m mVar, int i) {
            RenderableViewManager.super.setVectorEffect((ImageViewManager) mVar, i);
        }

        @ReactProp(name = "align")
        public void setAlign(C5971m mVar, String str) {
            mVar.setAlign(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5971m mVar, int i) {
            mVar.setMeetOrSlice(i);
        }

        @ReactProp(customType = "ImageSource", name = "src")
        public void setSrc(C5971m mVar, ReadableMap readableMap) {
            mVar.m26713h(readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5971m mVar, String str) {
            RenderableViewManager.super.setStrokeWidth((ImageViewManager) mVar, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5971m mVar, Dynamic dynamic) {
            mVar.m26716e(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5971m mVar, Dynamic dynamic) {
            mVar.m26712i(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5971m mVar, Dynamic dynamic) {
            mVar.m26709l(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5971m mVar, Dynamic dynamic) {
            mVar.m26706o(dynamic);
        }

        public void setHeight(C5971m mVar, String str) {
            mVar.m26714g(str);
        }

        public void setWidth(C5971m mVar, String str) {
            mVar.m26710k(str);
        }

        public void setX(C5971m mVar, String str) {
            mVar.m26707n(str);
        }

        public void setY(C5971m mVar, String str) {
            mVar.m26704q(str);
        }

        public void setHeight(C5971m mVar, Double d) {
            mVar.m26715f(d);
        }

        public void setWidth(C5971m mVar, Double d) {
            mVar.m26711j(d);
        }

        public void setX(C5971m mVar, Double d) {
            mVar.m26708m(d);
        }

        public void setY(C5971m mVar, Double d) {
            mVar.m26705p(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class LineViewManager extends RenderableViewManager<C5974n> implements RNSVGLineManagerInterface<C5974n> {
        public static final String REACT_CLASS = "RNSVGLine";

        /* JADX INFO: Access modifiers changed from: package-private */
        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new RNSVGLineManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5974n nVar, String str) {
            super.setClipPath((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5974n nVar, int i) {
            super.setClipRule((LineViewManager) nVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5974n nVar, String str) {
            super.setDisplay((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5974n nVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((LineViewManager) nVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5974n nVar, float f) {
            RenderableViewManager.super.setFillOpacity((LineViewManager) nVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5974n nVar, int i) {
            RenderableViewManager.super.setFillRule((LineViewManager) nVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5974n nVar, String str) {
            super.setMarkerEnd((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5974n nVar, String str) {
            super.setMarkerMid((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5974n nVar, String str) {
            super.setMarkerStart((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5974n nVar, String str) {
            super.setMask((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5974n nVar, ReadableArray readableArray) {
            super.setMatrix((LineViewManager) nVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5974n nVar, String str) {
            super.setName((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LineViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5974n nVar, String str) {
            super.setPointerEvents((LineViewManager) nVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5974n nVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((LineViewManager) nVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5974n nVar, boolean z) {
            super.setResponsible((LineViewManager) nVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5974n nVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((LineViewManager) nVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5974n nVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((LineViewManager) nVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5974n nVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((LineViewManager) nVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5974n nVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((LineViewManager) nVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5974n nVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((LineViewManager) nVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5974n nVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((LineViewManager) nVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5974n nVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((LineViewManager) nVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5974n nVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((LineViewManager) nVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5974n nVar, int i) {
            RenderableViewManager.super.setVectorEffect((LineViewManager) nVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5974n nVar, String str) {
            RenderableViewManager.super.setStrokeWidth((LineViewManager) nVar, str);
        }

        @ReactProp(name = "x1")
        public void setX1(C5974n nVar, Dynamic dynamic) {
            nVar.m26702a(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(C5974n nVar, Dynamic dynamic) {
            nVar.m26699d(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(C5974n nVar, Dynamic dynamic) {
            nVar.m26696g(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(C5974n nVar, Dynamic dynamic) {
            nVar.m26693j(dynamic);
        }

        public void setX1(C5974n nVar, String str) {
            nVar.m26700c(str);
        }

        public void setX2(C5974n nVar, String str) {
            nVar.m26697f(str);
        }

        public void setY1(C5974n nVar, String str) {
            nVar.m26694i(str);
        }

        public void setY2(C5974n nVar, String str) {
            nVar.m26691l(str);
        }

        public void setX1(C5974n nVar, Double d) {
            nVar.m26701b(d);
        }

        public void setX2(C5974n nVar, Double d) {
            nVar.m26698e(d);
        }

        public void setY1(C5974n nVar, Double d) {
            nVar.m26695h(d);
        }

        public void setY2(C5974n nVar, Double d) {
            nVar.m26692k(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class LinearGradientManager extends VirtualViewManager<C5976o> implements RNSVGLinearGradientManagerInterface<C5976o> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        /* JADX INFO: Access modifiers changed from: package-private */
        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new RNSVGLinearGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5976o oVar, String str) {
            super.setClipPath((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5976o oVar, int i) {
            super.setClipRule((LinearGradientManager) oVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5976o oVar, String str) {
            super.setDisplay((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5976o oVar, String str) {
            super.setMarkerEnd((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5976o oVar, String str) {
            super.setMarkerMid((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5976o oVar, String str) {
            super.setMarkerStart((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5976o oVar, String str) {
            super.setMask((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5976o oVar, ReadableArray readableArray) {
            super.setMatrix((LinearGradientManager) oVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5976o oVar, String str) {
            super.setName((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LinearGradientManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5976o oVar, String str) {
            super.setPointerEvents((LinearGradientManager) oVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5976o oVar, boolean z) {
            super.setResponsible((LinearGradientManager) oVar, z);
        }

        @ReactProp(name = "gradient")
        public void setGradient(C5976o oVar, ReadableArray readableArray) {
            oVar.m26689a(readableArray);
        }

        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(C5976o oVar, ReadableArray readableArray) {
            oVar.m26688b(readableArray);
        }

        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(C5976o oVar, int i) {
            oVar.m26687c(i);
        }

        @ReactProp(name = "x1")
        public void setX1(C5976o oVar, Dynamic dynamic) {
            oVar.m26686d(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(C5976o oVar, Dynamic dynamic) {
            oVar.m26683g(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(C5976o oVar, Dynamic dynamic) {
            oVar.m26680j(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(C5976o oVar, Dynamic dynamic) {
            oVar.m26677m(dynamic);
        }

        public void setX1(C5976o oVar, String str) {
            oVar.m26684f(str);
        }

        public void setX2(C5976o oVar, String str) {
            oVar.m26681i(str);
        }

        public void setY1(C5976o oVar, String str) {
            oVar.m26678l(str);
        }

        public void setY2(C5976o oVar, String str) {
            oVar.m26675o(str);
        }

        public void setX1(C5976o oVar, Double d) {
            oVar.m26685e(d);
        }

        public void setX2(C5976o oVar, Double d) {
            oVar.m26682h(d);
        }

        public void setY1(C5976o oVar, Double d) {
            oVar.m26679k(d);
        }

        public void setY2(C5976o oVar, Double d) {
            oVar.m26676n(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class MarkerManager extends GroupViewManagerAbstract<C5978p> implements RNSVGMarkerManagerInterface<C5978p> {
        public static final String REACT_CLASS = "RNSVGMarker";

        /* JADX INFO: Access modifiers changed from: package-private */
        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new RNSVGMarkerManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5978p pVar, String str) {
            super.setClipPath((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5978p pVar, int i) {
            super.setClipRule((MarkerManager) pVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5978p pVar, String str) {
            super.setDisplay((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5978p pVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((MarkerManager) pVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5978p pVar, float f) {
            RenderableViewManager.super.setFillOpacity((MarkerManager) pVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5978p pVar, int i) {
            RenderableViewManager.super.setFillRule((MarkerManager) pVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5978p pVar, ReadableMap readableMap) {
            super.setFont((MarkerManager) pVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5978p pVar, Double d) {
            super.setFontSize((MarkerManager) pVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5978p pVar, Double d) {
            super.setFontWeight((MarkerManager) pVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5978p pVar, String str) {
            super.setMarkerEnd((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5978p pVar, String str) {
            super.setMarkerMid((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5978p pVar, String str) {
            super.setMarkerStart((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5978p pVar, String str) {
            super.setMask((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5978p pVar, ReadableArray readableArray) {
            super.setMatrix((MarkerManager) pVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5978p pVar, String str) {
            super.setName((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MarkerManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5978p pVar, String str) {
            super.setPointerEvents((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5978p pVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((MarkerManager) pVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5978p pVar, boolean z) {
            super.setResponsible((MarkerManager) pVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5978p pVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((MarkerManager) pVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5978p pVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((MarkerManager) pVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5978p pVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((MarkerManager) pVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5978p pVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((MarkerManager) pVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5978p pVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((MarkerManager) pVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5978p pVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((MarkerManager) pVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5978p pVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((MarkerManager) pVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5978p pVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((MarkerManager) pVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5978p pVar, int i) {
            RenderableViewManager.super.setVectorEffect((MarkerManager) pVar, i);
        }

        @ReactProp(name = "align")
        public void setAlign(C5978p pVar, String str) {
            pVar.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5978p pVar, String str) {
            super.setFontSize((MarkerManager) pVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5978p pVar, String str) {
            super.setFontWeight((MarkerManager) pVar, str);
        }

        @ReactProp(name = "markerUnits")
        public void setMarkerUnits(C5978p pVar, String str) {
            pVar.m26670o(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5978p pVar, int i) {
            pVar.setMeetOrSlice(i);
        }

        @ReactProp(name = "minX")
        public void setMinX(C5978p pVar, float f) {
            pVar.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(C5978p pVar, float f) {
            pVar.setMinY(f);
        }

        @ReactProp(name = "orient")
        public void setOrient(C5978p pVar, String str) {
            pVar.m26666s(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5978p pVar, String str) {
            RenderableViewManager.super.setStrokeWidth((MarkerManager) pVar, str);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5978p pVar, float f) {
            pVar.setVbHeight(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5978p pVar, float f) {
            pVar.setVbWidth(f);
        }

        @ReactProp(name = "markerHeight")
        public void setMarkerHeight(C5978p pVar, Dynamic dynamic) {
            pVar.m26673l(dynamic);
        }

        @ReactProp(name = "markerWidth")
        public void setMarkerWidth(C5978p pVar, Dynamic dynamic) {
            pVar.m26669p(dynamic);
        }

        @ReactProp(name = "refX")
        public void setRefX(C5978p pVar, Dynamic dynamic) {
            pVar.m26665t(dynamic);
        }

        @ReactProp(name = "refY")
        public void setRefY(C5978p pVar, Dynamic dynamic) {
            pVar.m26662w(dynamic);
        }

        public void setMarkerHeight(C5978p pVar, String str) {
            pVar.m26671n(str);
        }

        public void setMarkerWidth(C5978p pVar, String str) {
            pVar.m26667r(str);
        }

        public void setRefX(C5978p pVar, String str) {
            pVar.m26663v(str);
        }

        public void setRefY(C5978p pVar, String str) {
            pVar.m26660y(str);
        }

        public void setMarkerHeight(C5978p pVar, Double d) {
            pVar.m26672m(d);
        }

        public void setMarkerWidth(C5978p pVar, Double d) {
            pVar.m26668q(d);
        }

        public void setRefX(C5978p pVar, Double d) {
            pVar.m26664u(d);
        }

        public void setRefY(C5978p pVar, Double d) {
            pVar.m26661x(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class MaskManager extends GroupViewManagerAbstract<C5980q> implements RNSVGMaskManagerInterface<C5980q> {
        public static final String REACT_CLASS = "RNSVGMask";

        /* JADX INFO: Access modifiers changed from: package-private */
        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new RNSVGMaskManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5980q qVar, String str) {
            super.setClipPath((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5980q qVar, int i) {
            super.setClipRule((MaskManager) qVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5980q qVar, String str) {
            super.setDisplay((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5980q qVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((MaskManager) qVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5980q qVar, float f) {
            RenderableViewManager.super.setFillOpacity((MaskManager) qVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5980q qVar, int i) {
            RenderableViewManager.super.setFillRule((MaskManager) qVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5980q qVar, ReadableMap readableMap) {
            super.setFont((MaskManager) qVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5980q qVar, Double d) {
            super.setFontSize((MaskManager) qVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5980q qVar, Double d) {
            super.setFontWeight((MaskManager) qVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5980q qVar, String str) {
            super.setMarkerEnd((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5980q qVar, String str) {
            super.setMarkerMid((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5980q qVar, String str) {
            super.setMarkerStart((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5980q qVar, String str) {
            super.setMask((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5980q qVar, ReadableArray readableArray) {
            super.setMatrix((MaskManager) qVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5980q qVar, String str) {
            super.setName((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MaskManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5980q qVar, String str) {
            super.setPointerEvents((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5980q qVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((MaskManager) qVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5980q qVar, boolean z) {
            super.setResponsible((MaskManager) qVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5980q qVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((MaskManager) qVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5980q qVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((MaskManager) qVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5980q qVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((MaskManager) qVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5980q qVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((MaskManager) qVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5980q qVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((MaskManager) qVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5980q qVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((MaskManager) qVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5980q qVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((MaskManager) qVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5980q qVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((MaskManager) qVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5980q qVar, int i) {
            RenderableViewManager.super.setVectorEffect((MaskManager) qVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5980q qVar, String str) {
            super.setFontSize((MaskManager) qVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5980q qVar, String str) {
            super.setFontWeight((MaskManager) qVar, str);
        }

        @ReactProp(name = "maskContentUnits")
        public void setMaskContentUnits(C5980q qVar, int i) {
            qVar.m26656n(i);
        }

        @ReactProp(name = "maskUnits")
        public void setMaskUnits(C5980q qVar, int i) {
            qVar.m26655o(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5980q qVar, String str) {
            RenderableViewManager.super.setStrokeWidth((MaskManager) qVar, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5980q qVar, Dynamic dynamic) {
            qVar.m26659k(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5980q qVar, Dynamic dynamic) {
            qVar.m26654p(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5980q qVar, Dynamic dynamic) {
            qVar.m26651s(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5980q qVar, Dynamic dynamic) {
            qVar.m26648v(dynamic);
        }

        public void setHeight(C5980q qVar, String str) {
            qVar.m26657m(str);
        }

        public void setWidth(C5980q qVar, String str) {
            qVar.m26652r(str);
        }

        public void setX(C5980q qVar, String str) {
            qVar.m26649u(str);
        }

        public void setY(C5980q qVar, String str) {
            qVar.m26646x(str);
        }

        public void setHeight(C5980q qVar, Double d) {
            qVar.m26658l(d);
        }

        public void setWidth(C5980q qVar, Double d) {
            qVar.m26653q(d);
        }

        public void setX(C5980q qVar, Double d) {
            qVar.m26650t(d);
        }

        public void setY(C5980q qVar, Double d) {
            qVar.m26647w(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class PathViewManager extends RenderableViewManager<C5987u> implements RNSVGPathManagerInterface<C5987u> {
        public static final String REACT_CLASS = "RNSVGPath";

        /* JADX INFO: Access modifiers changed from: package-private */
        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new RNSVGPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5987u uVar, String str) {
            super.setClipPath((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5987u uVar, int i) {
            super.setClipRule((PathViewManager) uVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5987u uVar, String str) {
            super.setDisplay((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5987u uVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((PathViewManager) uVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5987u uVar, float f) {
            RenderableViewManager.super.setFillOpacity((PathViewManager) uVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5987u uVar, int i) {
            RenderableViewManager.super.setFillRule((PathViewManager) uVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5987u uVar, String str) {
            super.setMarkerEnd((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5987u uVar, String str) {
            super.setMarkerMid((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5987u uVar, String str) {
            super.setMarkerStart((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5987u uVar, String str) {
            super.setMask((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5987u uVar, ReadableArray readableArray) {
            super.setMatrix((PathViewManager) uVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5987u uVar, String str) {
            super.setName((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5987u uVar, String str) {
            super.setPointerEvents((PathViewManager) uVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5987u uVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((PathViewManager) uVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5987u uVar, boolean z) {
            super.setResponsible((PathViewManager) uVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5987u uVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((PathViewManager) uVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5987u uVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((PathViewManager) uVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5987u uVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((PathViewManager) uVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5987u uVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((PathViewManager) uVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5987u uVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((PathViewManager) uVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5987u uVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((PathViewManager) uVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5987u uVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((PathViewManager) uVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5987u uVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((PathViewManager) uVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5987u uVar, int i) {
            RenderableViewManager.super.setVectorEffect((PathViewManager) uVar, i);
        }

        @ReactProp(name = "d")
        public void setD(C5987u uVar, String str) {
            uVar.m26586a(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5987u uVar, String str) {
            RenderableViewManager.super.setStrokeWidth((PathViewManager) uVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class PatternManager extends GroupViewManagerAbstract<C5989v> implements RNSVGPatternManagerInterface<C5989v> {
        public static final String REACT_CLASS = "RNSVGPattern";

        /* JADX INFO: Access modifiers changed from: package-private */
        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new RNSVGPatternManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5989v vVar, String str) {
            super.setClipPath((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5989v vVar, int i) {
            super.setClipRule((PatternManager) vVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5989v vVar, String str) {
            super.setDisplay((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5989v vVar, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((PatternManager) vVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5989v vVar, float f) {
            RenderableViewManager.super.setFillOpacity((PatternManager) vVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5989v vVar, int i) {
            RenderableViewManager.super.setFillRule((PatternManager) vVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5989v vVar, ReadableMap readableMap) {
            super.setFont((PatternManager) vVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5989v vVar, Double d) {
            super.setFontSize((PatternManager) vVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5989v vVar, Double d) {
            super.setFontWeight((PatternManager) vVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5989v vVar, String str) {
            super.setMarkerEnd((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5989v vVar, String str) {
            super.setMarkerMid((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5989v vVar, String str) {
            super.setMarkerStart((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5989v vVar, String str) {
            super.setMask((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5989v vVar, ReadableArray readableArray) {
            super.setMatrix((PatternManager) vVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5989v vVar, String str) {
            super.setName((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PatternManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5989v vVar, String str) {
            super.setPointerEvents((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5989v vVar, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((PatternManager) vVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5989v vVar, boolean z) {
            super.setResponsible((PatternManager) vVar, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5989v vVar, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((PatternManager) vVar, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5989v vVar, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((PatternManager) vVar, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5989v vVar, float f) {
            RenderableViewManager.super.setStrokeDashoffset((PatternManager) vVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5989v vVar, int i) {
            RenderableViewManager.super.setStrokeLinecap((PatternManager) vVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5989v vVar, int i) {
            RenderableViewManager.super.setStrokeLinejoin((PatternManager) vVar, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5989v vVar, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((PatternManager) vVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5989v vVar, float f) {
            RenderableViewManager.super.setStrokeOpacity((PatternManager) vVar, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5989v vVar, Double d) {
            RenderableViewManager.super.setStrokeWidth((PatternManager) vVar, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5989v vVar, int i) {
            RenderableViewManager.super.setVectorEffect((PatternManager) vVar, i);
        }

        @ReactProp(name = "align")
        public void setAlign(C5989v vVar, String str) {
            vVar.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5989v vVar, String str) {
            super.setFontSize((PatternManager) vVar, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5989v vVar, String str) {
            super.setFontWeight((PatternManager) vVar, str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5989v vVar, int i) {
            vVar.setMeetOrSlice(i);
        }

        @ReactProp(name = "minX")
        public void setMinX(C5989v vVar, float f) {
            vVar.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(C5989v vVar, float f) {
            vVar.setMinY(f);
        }

        @ReactProp(name = "patternContentUnits")
        public void setPatternContentUnits(C5989v vVar, int i) {
            vVar.m26569n(i);
        }

        @ReactProp(name = "patternTransform")
        public void setPatternTransform(C5989v vVar, ReadableArray readableArray) {
            vVar.m26568o(readableArray);
        }

        @ReactProp(name = "patternUnits")
        public void setPatternUnits(C5989v vVar, int i) {
            vVar.m26567p(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5989v vVar, String str) {
            RenderableViewManager.super.setStrokeWidth((PatternManager) vVar, str);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5989v vVar, float f) {
            vVar.setVbHeight(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5989v vVar, float f) {
            vVar.setVbWidth(f);
        }

        @ReactProp(name = "height")
        public void setHeight(C5989v vVar, Dynamic dynamic) {
            vVar.m26572k(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5989v vVar, Dynamic dynamic) {
            vVar.m26566q(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5989v vVar, Dynamic dynamic) {
            vVar.m26563t(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5989v vVar, Dynamic dynamic) {
            vVar.m26560w(dynamic);
        }

        public void setHeight(C5989v vVar, String str) {
            vVar.m26570m(str);
        }

        public void setWidth(C5989v vVar, String str) {
            vVar.m26564s(str);
        }

        public void setX(C5989v vVar, String str) {
            vVar.m26561v(str);
        }

        public void setY(C5989v vVar, String str) {
            vVar.m26558y(str);
        }

        public void setHeight(C5989v vVar, Double d) {
            vVar.m26571l(d);
        }

        public void setWidth(C5989v vVar, Double d) {
            vVar.m26565r(d);
        }

        public void setX(C5989v vVar, Double d) {
            vVar.m26562u(d);
        }

        public void setY(C5989v vVar, Double d) {
            vVar.m26559x(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class RadialGradientManager extends VirtualViewManager<C5946a0> implements RNSVGRadialGradientManagerInterface<C5946a0> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        /* JADX INFO: Access modifiers changed from: package-private */
        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new RNSVGRadialGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5946a0 a0Var, String str) {
            super.setClipPath((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5946a0 a0Var, int i) {
            super.setClipRule((RadialGradientManager) a0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5946a0 a0Var, String str) {
            super.setDisplay((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5946a0 a0Var, String str) {
            super.setMarkerEnd((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5946a0 a0Var, String str) {
            super.setMarkerMid((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5946a0 a0Var, String str) {
            super.setMarkerStart((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5946a0 a0Var, String str) {
            super.setMask((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5946a0 a0Var, ReadableArray readableArray) {
            super.setMatrix((RadialGradientManager) a0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5946a0 a0Var, String str) {
            super.setName((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RadialGradientManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5946a0 a0Var, String str) {
            super.setPointerEvents((RadialGradientManager) a0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5946a0 a0Var, boolean z) {
            super.setResponsible((RadialGradientManager) a0Var, z);
        }

        @ReactProp(name = "gradient")
        public void setGradient(C5946a0 a0Var, ReadableArray readableArray) {
            a0Var.m26843m(readableArray);
        }

        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(C5946a0 a0Var, ReadableArray readableArray) {
            a0Var.m26842n(readableArray);
        }

        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(C5946a0 a0Var, int i) {
            a0Var.m26841o(i);
        }

        @ReactProp(name = "cx")
        public void setCx(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26855a(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26852d(dynamic);
        }

        @ReactProp(name = "fx")
        public void setFx(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26849g(dynamic);
        }

        @ReactProp(name = "fy")
        public void setFy(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26846j(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26840p(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5946a0 a0Var, Dynamic dynamic) {
            a0Var.m26837s(dynamic);
        }

        public void setCx(C5946a0 a0Var, String str) {
            a0Var.m26853c(str);
        }

        public void setCy(C5946a0 a0Var, String str) {
            a0Var.m26850f(str);
        }

        public void setFx(C5946a0 a0Var, String str) {
            a0Var.m26847i(str);
        }

        public void setFy(C5946a0 a0Var, String str) {
            a0Var.m26844l(str);
        }

        public void setRx(C5946a0 a0Var, String str) {
            a0Var.m26838r(str);
        }

        public void setRy(C5946a0 a0Var, String str) {
            a0Var.m26835u(str);
        }

        public void setCx(C5946a0 a0Var, Double d) {
            a0Var.m26854b(d);
        }

        public void setCy(C5946a0 a0Var, Double d) {
            a0Var.m26851e(d);
        }

        public void setFx(C5946a0 a0Var, Double d) {
            a0Var.m26848h(d);
        }

        public void setFy(C5946a0 a0Var, Double d) {
            a0Var.m26845k(d);
        }

        public void setRx(C5946a0 a0Var, Double d) {
            a0Var.m26839q(d);
        }

        public void setRy(C5946a0 a0Var, Double d) {
            a0Var.m26836t(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class RectViewManager extends RenderableViewManager<C5948b0> implements RNSVGRectManagerInterface<C5948b0> {
        public static final String REACT_CLASS = "RNSVGRect";

        /* JADX INFO: Access modifiers changed from: package-private */
        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new RNSVGRectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5948b0 b0Var, String str) {
            super.setClipPath((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5948b0 b0Var, int i) {
            super.setClipRule((RectViewManager) b0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5948b0 b0Var, String str) {
            super.setDisplay((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5948b0 b0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((RectViewManager) b0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5948b0 b0Var, float f) {
            RenderableViewManager.super.setFillOpacity((RectViewManager) b0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5948b0 b0Var, int i) {
            RenderableViewManager.super.setFillRule((RectViewManager) b0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5948b0 b0Var, String str) {
            super.setMarkerEnd((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5948b0 b0Var, String str) {
            super.setMarkerMid((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5948b0 b0Var, String str) {
            super.setMarkerStart((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5948b0 b0Var, String str) {
            super.setMask((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5948b0 b0Var, ReadableArray readableArray) {
            super.setMatrix((RectViewManager) b0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5948b0 b0Var, String str) {
            super.setName((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RectViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5948b0 b0Var, String str) {
            super.setPointerEvents((RectViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5948b0 b0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RectViewManager) b0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5948b0 b0Var, boolean z) {
            super.setResponsible((RectViewManager) b0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5948b0 b0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((RectViewManager) b0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5948b0 b0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((RectViewManager) b0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5948b0 b0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((RectViewManager) b0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5948b0 b0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((RectViewManager) b0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5948b0 b0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((RectViewManager) b0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5948b0 b0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((RectViewManager) b0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5948b0 b0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((RectViewManager) b0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5948b0 b0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((RectViewManager) b0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5948b0 b0Var, int i) {
            RenderableViewManager.super.setVectorEffect((RectViewManager) b0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5948b0 b0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((RectViewManager) b0Var, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26825a(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26822d(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26819g(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26816j(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26813m(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5948b0 b0Var, Dynamic dynamic) {
            b0Var.m26810p(dynamic);
        }

        public void setHeight(C5948b0 b0Var, String str) {
            b0Var.m26823c(str);
        }

        public void setRx(C5948b0 b0Var, String str) {
            b0Var.m26820f(str);
        }

        public void setRy(C5948b0 b0Var, String str) {
            b0Var.m26817i(str);
        }

        public void setWidth(C5948b0 b0Var, String str) {
            b0Var.m26814l(str);
        }

        public void setX(C5948b0 b0Var, String str) {
            b0Var.m26811o(str);
        }

        public void setY(C5948b0 b0Var, String str) {
            b0Var.m26808r(str);
        }

        public void setHeight(C5948b0 b0Var, Double d) {
            b0Var.m26824b(d);
        }

        public void setRx(C5948b0 b0Var, Double d) {
            b0Var.m26821e(d);
        }

        public void setRy(C5948b0 b0Var, Double d) {
            b0Var.m26818h(d);
        }

        public void setWidth(C5948b0 b0Var, Double d) {
            b0Var.m26815k(d);
        }

        public void setX(C5948b0 b0Var, Double d) {
            b0Var.m26812n(d);
        }

        public void setY(C5948b0 b0Var, Double d) {
            b0Var.m26809q(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class SymbolManager extends GroupViewManagerAbstract<C5952d0> implements RNSVGSymbolManagerInterface<C5952d0> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        /* JADX INFO: Access modifiers changed from: package-private */
        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new RNSVGSymbolManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5952d0 d0Var, String str) {
            super.setClipPath((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5952d0 d0Var, int i) {
            super.setClipRule((SymbolManager) d0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5952d0 d0Var, String str) {
            super.setDisplay((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5952d0 d0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((SymbolManager) d0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5952d0 d0Var, float f) {
            RenderableViewManager.super.setFillOpacity((SymbolManager) d0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5952d0 d0Var, int i) {
            RenderableViewManager.super.setFillRule((SymbolManager) d0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5952d0 d0Var, ReadableMap readableMap) {
            super.setFont((SymbolManager) d0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5952d0 d0Var, Double d) {
            super.setFontSize((SymbolManager) d0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5952d0 d0Var, Double d) {
            super.setFontWeight((SymbolManager) d0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5952d0 d0Var, String str) {
            super.setMarkerEnd((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5952d0 d0Var, String str) {
            super.setMarkerMid((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5952d0 d0Var, String str) {
            super.setMarkerStart((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5952d0 d0Var, String str) {
            super.setMask((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5952d0 d0Var, ReadableArray readableArray) {
            super.setMatrix((SymbolManager) d0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5952d0 d0Var, String str) {
            super.setName((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((SymbolManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5952d0 d0Var, String str) {
            super.setPointerEvents((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5952d0 d0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((SymbolManager) d0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5952d0 d0Var, boolean z) {
            super.setResponsible((SymbolManager) d0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5952d0 d0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((SymbolManager) d0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5952d0 d0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((SymbolManager) d0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5952d0 d0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((SymbolManager) d0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5952d0 d0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((SymbolManager) d0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5952d0 d0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((SymbolManager) d0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5952d0 d0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((SymbolManager) d0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5952d0 d0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((SymbolManager) d0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5952d0 d0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((SymbolManager) d0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5952d0 d0Var, int i) {
            RenderableViewManager.super.setVectorEffect((SymbolManager) d0Var, i);
        }

        @ReactProp(name = "align")
        public void setAlign(C5952d0 d0Var, String str) {
            d0Var.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5952d0 d0Var, String str) {
            super.setFontSize((SymbolManager) d0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5952d0 d0Var, String str) {
            super.setFontWeight((SymbolManager) d0Var, str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5952d0 d0Var, int i) {
            d0Var.setMeetOrSlice(i);
        }

        @ReactProp(name = "minX")
        public void setMinX(C5952d0 d0Var, float f) {
            d0Var.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(C5952d0 d0Var, float f) {
            d0Var.setMinY(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5952d0 d0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((SymbolManager) d0Var, str);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5952d0 d0Var, float f) {
            d0Var.setVbHeight(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5952d0 d0Var, float f) {
            d0Var.setVbWidth(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class TSpanViewManager extends TextViewManagerAbstract<C5958g0> implements RNSVGTSpanManagerInterface<C5958g0> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        /* JADX INFO: Access modifiers changed from: package-private */
        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5958g0 g0Var, String str) {
            super.setAlignmentBaseline((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5958g0 g0Var, Double d) {
            super.setBaselineShift((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5958g0 g0Var, String str) {
            super.setClipPath((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5958g0 g0Var, int i) {
            super.setClipRule((TSpanViewManager) g0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5958g0 g0Var, String str) {
            super.setDisplay((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5958g0 g0Var, ReadableArray readableArray) {
            super.setDx((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5958g0 g0Var, ReadableArray readableArray) {
            super.setDy((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5958g0 g0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((TSpanViewManager) g0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5958g0 g0Var, float f) {
            RenderableViewManager.super.setFillOpacity((TSpanViewManager) g0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5958g0 g0Var, int i) {
            RenderableViewManager.super.setFillRule((TSpanViewManager) g0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5958g0 g0Var, ReadableMap readableMap) {
            super.setFont((TSpanViewManager) g0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5958g0 g0Var, Double d) {
            super.setFontSize((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5958g0 g0Var, Double d) {
            super.setFontWeight((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5958g0 g0Var, Double d) {
            super.setInlineSize((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5958g0 g0Var, String str) {
            super.setLengthAdjust((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5958g0 g0Var, String str) {
            super.setMarkerEnd((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5958g0 g0Var, String str) {
            super.setMarkerMid((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5958g0 g0Var, String str) {
            super.setMarkerStart((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5958g0 g0Var, String str) {
            super.setMask((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5958g0 g0Var, ReadableArray readableArray) {
            super.setMatrix((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5958g0 g0Var, String str) {
            super.setName((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TSpanViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5958g0 g0Var, String str) {
            super.setPointerEvents((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5958g0 g0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5958g0 g0Var, boolean z) {
            super.setResponsible((TSpanViewManager) g0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5958g0 g0Var, ReadableArray readableArray) {
            super.setRotate((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5958g0 g0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((TSpanViewManager) g0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5958g0 g0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5958g0 g0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((TSpanViewManager) g0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5958g0 g0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((TSpanViewManager) g0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5958g0 g0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((TSpanViewManager) g0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5958g0 g0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((TSpanViewManager) g0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5958g0 g0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((TSpanViewManager) g0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5958g0 g0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5958g0 g0Var, Double d) {
            super.setTextLength((TSpanViewManager) g0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5958g0 g0Var, int i) {
            RenderableViewManager.super.setVectorEffect((TSpanViewManager) g0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5958g0 g0Var, String str) {
            super.setVerticalAlign((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5958g0 g0Var, ReadableArray readableArray) {
            super.setX((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5958g0 g0Var, ReadableArray readableArray) {
            super.setY((TSpanViewManager) g0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5958g0 g0Var, String str) {
            super.setBaselineShift((TSpanViewManager) g0Var, str);
        }

        @ReactProp(name = "content")
        public void setContent(C5958g0 g0Var, String str) {
            g0Var.m26785T(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5958g0 g0Var, String str) {
            super.setFontSize((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5958g0 g0Var, String str) {
            super.setFontWeight((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5958g0 g0Var, String str) {
            super.setInlineSize((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5958g0 g0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((TSpanViewManager) g0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5958g0 g0Var, String str) {
            super.setTextLength((TSpanViewManager) g0Var, str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class TextPathViewManager extends TextViewManagerAbstract<C5962h0> implements RNSVGTextPathManagerInterface<C5962h0> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        /* JADX INFO: Access modifiers changed from: package-private */
        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5962h0 h0Var, String str) {
            super.setAlignmentBaseline((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5962h0 h0Var, Double d) {
            super.setBaselineShift((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5962h0 h0Var, String str) {
            super.setClipPath((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5962h0 h0Var, int i) {
            super.setClipRule((TextPathViewManager) h0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5962h0 h0Var, String str) {
            super.setDisplay((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5962h0 h0Var, ReadableArray readableArray) {
            super.setDx((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5962h0 h0Var, ReadableArray readableArray) {
            super.setDy((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5962h0 h0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((TextPathViewManager) h0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5962h0 h0Var, float f) {
            RenderableViewManager.super.setFillOpacity((TextPathViewManager) h0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5962h0 h0Var, int i) {
            RenderableViewManager.super.setFillRule((TextPathViewManager) h0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5962h0 h0Var, ReadableMap readableMap) {
            super.setFont((TextPathViewManager) h0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5962h0 h0Var, Double d) {
            super.setFontSize((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5962h0 h0Var, Double d) {
            super.setFontWeight((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5962h0 h0Var, Double d) {
            super.setInlineSize((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5962h0 h0Var, String str) {
            super.setLengthAdjust((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5962h0 h0Var, String str) {
            super.setMarkerEnd((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5962h0 h0Var, String str) {
            super.setMarkerMid((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5962h0 h0Var, String str) {
            super.setMarkerStart((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5962h0 h0Var, String str) {
            super.setMask((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5962h0 h0Var, ReadableArray readableArray) {
            super.setMatrix((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5962h0 h0Var, String str) {
            super.setName((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextPathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5962h0 h0Var, String str) {
            super.setPointerEvents((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5962h0 h0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5962h0 h0Var, boolean z) {
            super.setResponsible((TextPathViewManager) h0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5962h0 h0Var, ReadableArray readableArray) {
            super.setRotate((TextPathViewManager) h0Var, readableArray);
        }

        @ReactProp(name = "midLine")
        public void setSharp(C5962h0 h0Var, String str) {
            h0Var.m26770R(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5962h0 h0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((TextPathViewManager) h0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5962h0 h0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5962h0 h0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((TextPathViewManager) h0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5962h0 h0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((TextPathViewManager) h0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5962h0 h0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((TextPathViewManager) h0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5962h0 h0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((TextPathViewManager) h0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5962h0 h0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((TextPathViewManager) h0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5962h0 h0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5962h0 h0Var, Double d) {
            super.setTextLength((TextPathViewManager) h0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5962h0 h0Var, int i) {
            RenderableViewManager.super.setVectorEffect((TextPathViewManager) h0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5962h0 h0Var, String str) {
            super.setVerticalAlign((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5962h0 h0Var, ReadableArray readableArray) {
            super.setX((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5962h0 h0Var, ReadableArray readableArray) {
            super.setY((TextPathViewManager) h0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5962h0 h0Var, String str) {
            super.setBaselineShift((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5962h0 h0Var, String str) {
            super.setFontSize((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5962h0 h0Var, String str) {
            super.setFontWeight((TextPathViewManager) h0Var, str);
        }

        @ReactProp(name = "href")
        public void setHref(C5962h0 h0Var, String str) {
            h0Var.m26771Q(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5962h0 h0Var, String str) {
            super.setInlineSize((TextPathViewManager) h0Var, str);
        }

        public void setMidLine(C5962h0 h0Var, String str) {
            h0Var.m26770R(str);
        }

        @ReactProp(name = "side")
        public void setSide(C5962h0 h0Var, String str) {
            h0Var.m26769S(str);
        }

        @ReactProp(name = "spacing")
        public void setSpacing(C5962h0 h0Var, String str) {
            h0Var.m26768T(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5962h0 h0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((TextPathViewManager) h0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5962h0 h0Var, String str) {
            super.setTextLength((TextPathViewManager) h0Var, str);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @ReactProp(name = "method")
        public void setMethod(C5962h0 h0Var, String str) {
            h0Var.mo26615B(str);
        }

        @ReactProp(name = "startOffset")
        public void setStartOffset(C5962h0 h0Var, Dynamic dynamic) {
            h0Var.m26767U(dynamic);
        }

        public void setStartOffset(C5962h0 h0Var, String str) {
            h0Var.m26765W(str);
        }

        public void setStartOffset(C5962h0 h0Var, Double d) {
            h0Var.m26766V(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class TextViewManager extends TextViewManagerAbstract<C5986t0> implements RNSVGTextManagerInterface<C5986t0> {
        public static final String REACT_CLASS = "RNSVGText";

        /* JADX INFO: Access modifiers changed from: package-private */
        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5986t0 t0Var, String str) {
            super.setAlignmentBaseline((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5986t0 t0Var, Double d) {
            super.setBaselineShift((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5986t0 t0Var, String str) {
            super.setClipPath((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5986t0 t0Var, int i) {
            super.setClipRule((TextViewManager) t0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5986t0 t0Var, String str) {
            super.setDisplay((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5986t0 t0Var, ReadableArray readableArray) {
            super.setDx((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5986t0 t0Var, ReadableArray readableArray) {
            super.setDy((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5986t0 t0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((TextViewManager) t0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5986t0 t0Var, float f) {
            RenderableViewManager.super.setFillOpacity((TextViewManager) t0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5986t0 t0Var, int i) {
            RenderableViewManager.super.setFillRule((TextViewManager) t0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5986t0 t0Var, ReadableMap readableMap) {
            super.setFont((TextViewManager) t0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5986t0 t0Var, Double d) {
            super.setFontSize((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5986t0 t0Var, Double d) {
            super.setFontWeight((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5986t0 t0Var, Double d) {
            super.setInlineSize((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5986t0 t0Var, String str) {
            super.setLengthAdjust((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5986t0 t0Var, String str) {
            super.setMarkerEnd((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5986t0 t0Var, String str) {
            super.setMarkerMid((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5986t0 t0Var, String str) {
            super.setMarkerStart((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5986t0 t0Var, String str) {
            super.setMask((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5986t0 t0Var, ReadableArray readableArray) {
            super.setMatrix((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5986t0 t0Var, String str) {
            super.setName((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5986t0 t0Var, String str) {
            super.setPointerEvents((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5986t0 t0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5986t0 t0Var, boolean z) {
            super.setResponsible((TextViewManager) t0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5986t0 t0Var, ReadableArray readableArray) {
            super.setRotate((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5986t0 t0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((TextViewManager) t0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5986t0 t0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5986t0 t0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((TextViewManager) t0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5986t0 t0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((TextViewManager) t0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5986t0 t0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((TextViewManager) t0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5986t0 t0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((TextViewManager) t0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5986t0 t0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((TextViewManager) t0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5986t0 t0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5986t0 t0Var, Double d) {
            super.setTextLength((TextViewManager) t0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5986t0 t0Var, int i) {
            RenderableViewManager.super.setVectorEffect((TextViewManager) t0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5986t0 t0Var, String str) {
            super.setVerticalAlign((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5986t0 t0Var, ReadableArray readableArray) {
            super.setX((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5986t0 t0Var, ReadableArray readableArray) {
            super.setY((TextViewManager) t0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5986t0 t0Var, String str) {
            super.setBaselineShift((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5986t0 t0Var, String str) {
            super.setFontSize((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5986t0 t0Var, String str) {
            super.setFontWeight((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5986t0 t0Var, String str) {
            super.setInlineSize((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5986t0 t0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((TextViewManager) t0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5986t0 t0Var, String str) {
            super.setTextLength((TextViewManager) t0Var, str);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }
    }

    /* loaded from: classes6.dex */
    static class TextViewManagerAbstract<K extends C5986t0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public void setAlignmentBaseline(K k, String str) {
            k.mo26615B(str);
        }

        @ReactProp(name = "baselineShift")
        public void setBaselineShift(K k, Dynamic dynamic) {
            k.m26596q(dynamic);
        }

        @ReactProp(name = "dx")
        public void setDeltaX(K k, Dynamic dynamic) {
            k.m26593t(dynamic);
        }

        @ReactProp(name = "dy")
        public void setDeltaY(K k, Dynamic dynamic) {
            k.m26591v(dynamic);
        }

        public void setDx(K k, ReadableArray readableArray) {
            k.m26592u(readableArray);
        }

        public void setDy(K k, ReadableArray readableArray) {
            k.m26590w(readableArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5969l lVar, ReadableMap readableMap) {
            setFont((TextViewManagerAbstract<K>) ((C5986t0) lVar), readableMap);
        }

        @ReactProp(name = "inlineSize")
        public void setInlineSize(K k, Dynamic dynamic) {
            k.m26589x(dynamic);
        }

        @ReactProp(name = "lengthAdjust")
        public void setLengthAdjust(K k, String str) {
            k.m26616A(str);
        }

        @ReactProp(name = "alignmentBaseline")
        public void setMethod(K k, String str) {
            k.mo26615B(str);
        }

        @ReactProp(name = "rotate")
        public void setRotate(K k, Dynamic dynamic) {
            k.m26610G(dynamic);
        }

        @ReactProp(name = "textLength")
        public void setTextLength(K k, Dynamic dynamic) {
            k.m26608I(dynamic);
        }

        @ReactProp(name = "verticalAlign")
        public void setVerticalAlign(K k, String str) {
            k.m26605L(str);
        }

        @ReactProp(name = "x")
        public void setX(K k, Dynamic dynamic) {
            k.m26614C(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(K k, Dynamic dynamic) {
            k.m26612E(dynamic);
        }

        public void setBaselineShift(K k, String str) {
            k.m26594s(str);
        }

        @ReactProp(name = "font")
        public void setFont(K k, ReadableMap readableMap) {
            k.m26724i(readableMap);
        }

        public void setInlineSize(K k, String str) {
            k.m26587z(str);
        }

        public void setRotate(K k, ReadableArray readableArray) {
            k.m26609H(readableArray);
        }

        public void setTextLength(K k, String str) {
            k.m26606K(str);
        }

        public void setX(K k, ReadableArray readableArray) {
            k.m26613D(readableArray);
        }

        public void setY(K k, ReadableArray readableArray) {
            k.m26611F(readableArray);
        }

        public void setBaselineShift(K k, Double d) {
            k.m26595r(d);
        }

        public void setInlineSize(K k, Double d) {
            k.m26588y(d);
        }

        public void setTextLength(K k, Double d) {
            k.m26607J(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class UseViewManager extends RenderableViewManager<C5988u0> implements RNSVGUseManagerInterface<C5988u0> {
        public static final String REACT_CLASS = "RNSVGUse";

        /* JADX INFO: Access modifiers changed from: package-private */
        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new RNSVGUseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5988u0 u0Var, String str) {
            super.setClipPath((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5988u0 u0Var, int i) {
            super.setClipRule((UseViewManager) u0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5988u0 u0Var, String str) {
            super.setDisplay((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5988u0 u0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setFill((UseViewManager) u0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5988u0 u0Var, float f) {
            RenderableViewManager.super.setFillOpacity((UseViewManager) u0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5988u0 u0Var, int i) {
            RenderableViewManager.super.setFillRule((UseViewManager) u0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5988u0 u0Var, String str) {
            super.setMarkerEnd((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5988u0 u0Var, String str) {
            super.setMarkerMid((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5988u0 u0Var, String str) {
            super.setMarkerStart((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5988u0 u0Var, String str) {
            super.setMask((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5988u0 u0Var, ReadableArray readableArray) {
            super.setMatrix((UseViewManager) u0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C5988u0 u0Var, String str) {
            super.setName((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((UseViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5988u0 u0Var, String str) {
            super.setPointerEvents((UseViewManager) u0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5988u0 u0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((UseViewManager) u0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5988u0 u0Var, boolean z) {
            super.setResponsible((UseViewManager) u0Var, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5988u0 u0Var, ReadableMap readableMap) {
            RenderableViewManager.super.setStroke((UseViewManager) u0Var, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5988u0 u0Var, ReadableArray readableArray) {
            RenderableViewManager.super.setStrokeDasharray((UseViewManager) u0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5988u0 u0Var, float f) {
            RenderableViewManager.super.setStrokeDashoffset((UseViewManager) u0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5988u0 u0Var, int i) {
            RenderableViewManager.super.setStrokeLinecap((UseViewManager) u0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5988u0 u0Var, int i) {
            RenderableViewManager.super.setStrokeLinejoin((UseViewManager) u0Var, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5988u0 u0Var, float f) {
            RenderableViewManager.super.setStrokeMiterlimit((UseViewManager) u0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5988u0 u0Var, float f) {
            RenderableViewManager.super.setStrokeOpacity((UseViewManager) u0Var, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5988u0 u0Var, Double d) {
            RenderableViewManager.super.setStrokeWidth((UseViewManager) u0Var, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5988u0 u0Var, int i) {
            RenderableViewManager.super.setVectorEffect((UseViewManager) u0Var, i);
        }

        @ReactProp(name = "href")
        public void setHref(C5988u0 u0Var, String str) {
            u0Var.m26582d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5988u0 u0Var, String str) {
            RenderableViewManager.super.setStrokeWidth((UseViewManager) u0Var, str);
        }

        public void setHeight(C5988u0 u0Var, String str) {
            u0Var.m26583c(str);
        }

        public void setWidth(C5988u0 u0Var, Double d) {
            u0Var.m26580f(d);
        }

        public void setX(C5988u0 u0Var, String str) {
            u0Var.m26576j(str);
        }

        public void setY(C5988u0 u0Var, String str) {
            u0Var.m26573m(str);
        }

        public void setHeight(C5988u0 u0Var, Double d) {
            u0Var.m26584b(d);
        }

        public void setWidth(C5988u0 u0Var, String str) {
            u0Var.m26579g(str);
        }

        public void setX(C5988u0 u0Var, Double d) {
            u0Var.m26577i(d);
        }

        public void setY(C5988u0 u0Var, Double d) {
            u0Var.m26574l(d);
        }

        @ReactProp(name = "height")
        public void setHeight(C5988u0 u0Var, Dynamic dynamic) {
            u0Var.m26585a(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5988u0 u0Var, Dynamic dynamic) {
            u0Var.m26581e(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5988u0 u0Var, Dynamic dynamic) {
            u0Var.m26578h(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5988u0 u0Var, Dynamic dynamic) {
            u0Var.m26575k(dynamic);
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$a */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C5913a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11766a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f11766a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11766a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @ReactProp(name = "fill")
    public void setFill(T t, Dynamic dynamic) {
        t.setFill(dynamic);
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t, float f) {
        t.setFillOpacity(f);
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t, int i) {
        t.setFillRule(i);
    }

    @ReactProp(name = "propList")
    public void setPropList(T t, ReadableArray readableArray) {
        t.setPropList(readableArray);
    }

    @ReactProp(name = "stroke")
    public void setStroke(T t, Dynamic dynamic) {
        t.setStroke(dynamic);
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(T t, ReadableArray readableArray) {
        t.setStrokeDasharray(readableArray);
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t, float f) {
        t.setStrokeDashoffset(f);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t, int i) {
        t.setStrokeLinecap(i);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t, int i) {
        t.setStrokeLinejoin(i);
    }

    @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t, float f) {
        t.setStrokeMiterlimit(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t, float f) {
        t.setStrokeOpacity(f);
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(T t, Dynamic dynamic) {
        t.setStrokeWidth(dynamic);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(T t, int i) {
        t.setVectorEffect(i);
    }

    public void setFill(T t, ReadableMap readableMap) {
        t.setFill(readableMap);
    }

    public void setStroke(T t, ReadableMap readableMap) {
        t.setStroke(readableMap);
    }

    public void setStrokeWidth(T t, String str) {
        t.setStrokeWidth(str);
    }

    public void setStrokeWidth(T t, Double d) {
        t.setStrokeWidth(d);
    }

    /* loaded from: classes6.dex */
    static class GroupViewManagerAbstract<U extends C5969l> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "font")
        public void setFont(U u, ReadableMap readableMap) {
            u.m26724i(readableMap);
        }

        @ReactProp(name = ViewProps.FONT_SIZE)
        public void setFontSize(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5913a.f11766a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_SIZE, dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString(ViewProps.FONT_SIZE, dynamic.asString());
            } else {
                return;
            }
            u.m26724i(javaOnlyMap);
        }

        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public void setFontWeight(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5913a.f11766a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString(ViewProps.FONT_WEIGHT, dynamic.asString());
            } else {
                return;
            }
            u.m26724i(javaOnlyMap);
        }

        public void setFontSize(U u, String str) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString(ViewProps.FONT_SIZE, str);
            u.m26724i(javaOnlyMap);
        }

        public void setFontWeight(U u, String str) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString(ViewProps.FONT_WEIGHT, str);
            u.m26724i(javaOnlyMap);
        }

        public void setFontSize(U u, Double d) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble(ViewProps.FONT_SIZE, d.doubleValue());
            u.m26724i(javaOnlyMap);
        }

        public void setFontWeight(U u, Double d) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, d.doubleValue());
            u.m26724i(javaOnlyMap);
        }
    }
}
