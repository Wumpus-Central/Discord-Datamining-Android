.class final Lki/r$b$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lki/r$b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljg/h;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lki/r$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lki/r$b$a;

    invoke-direct {v0}, Lki/r$b$a;-><init>()V

    sput-object v0, Lki/r$b$a;->k:Lki/r$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljg/h;)Ldi/g0;
    .locals 1

    .line 1
    const-string v0, "$this$null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljg/h;->D()Ldi/o0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "intType"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p1
    .line 16
    .line 17
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljg/h;

    invoke-virtual {p0, p1}, Lki/r$b$a;->a(Ljg/h;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
