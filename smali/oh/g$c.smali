.class final Loh/g$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loh/g;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/g0;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Loh/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loh/g$c;

    invoke-direct {v0}, Loh/g$c;-><init>()V

    sput-object v0, Loh/g$c;->k:Loh/g$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/g0;)Ldi/g0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/g0;

    invoke-virtual {p0, p1}, Loh/g$c;->a(Ldi/g0;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
