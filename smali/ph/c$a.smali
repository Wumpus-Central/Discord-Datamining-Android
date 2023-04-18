.class final Lph/c$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lph/c;->b(Lmg/a;Lmg/a;ZZZLei/g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmg/m;",
        "Lmg/m;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lph/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lph/c$a;

    invoke-direct {v0}, Lph/c$a;-><init>()V

    sput-object v0, Lph/c$a;->k:Lph/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/m;Lmg/m;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/m;

    check-cast p2, Lmg/m;

    invoke-virtual {p0, p1, p2}, Lph/c$a;->a(Lmg/m;Lmg/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
