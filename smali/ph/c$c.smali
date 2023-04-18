.class final Lph/c$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lph/c;->j(Lph/c;Lmg/f1;Lmg/f1;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z
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
.field public static final k:Lph/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lph/c$c;

    invoke-direct {v0}, Lph/c$c;-><init>()V

    sput-object v0, Lph/c$c;->k:Lph/c$c;

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

    invoke-virtual {p0, p1, p2}, Lph/c$c;->a(Lmg/m;Lmg/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
