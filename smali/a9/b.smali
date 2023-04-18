.class public final synthetic La9/b;
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

    check-cast p1, Ld7/k;

    check-cast p2, Ld7/k;

    invoke-static {p1, p2}, La9/c;->s(Ld7/k;Ld7/k;)I

    move-result p1

    return p1
.end method
