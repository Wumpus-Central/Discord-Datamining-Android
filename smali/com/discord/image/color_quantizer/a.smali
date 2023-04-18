.class public final synthetic Lcom/discord/image/color_quantizer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    check-cast p2, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    invoke-static {p1, p2}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->a(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;)I

    move-result p1

    return p1
.end method
