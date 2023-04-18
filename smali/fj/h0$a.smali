.class Lfj/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lfj/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Lfj/k0;Lfj/k0;Lfj/k;Lfj/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TU;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljava/util/Map;

.field final synthetic l:Lfj/h0;


# direct methods
.method constructor <init>(Lfj/h0;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lfj/h0$a;->l:Lfj/h0;

    iput-object p2, p0, Lfj/h0$a;->k:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;TU;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lfj/h0$a;->k:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lfj/h0;->D(Ljava/util/Map;Ljava/lang/Object;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, Lfj/h0$a;->k:Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {p1, p2}, Lfj/h0;->D(Ljava/util/Map;Ljava/lang/Object;)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Double;->compare(DD)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
