.class final Lii/a$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lii/a;->e(Ldi/g0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/v1;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lii/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lii/a$b;

    invoke-direct {v0}, Lii/a$b;-><init>()V

    sput-object v0, Lii/a$b;->k:Lii/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/v1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p1}, Ldi/s1;->m(Ldi/g0;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/v1;

    invoke-virtual {p0, p1}, Lii/a$b;->a(Ldi/v1;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
