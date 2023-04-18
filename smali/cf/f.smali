.class public final synthetic Lcf/f;
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

    check-cast p1, Lcf/d;

    check-cast p2, Lcf/d;

    invoke-static {p1, p2}, Lcf/g;->a(Lcf/d;Lcf/d;)I

    move-result p1

    return p1
.end method
