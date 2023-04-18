.class public final Ljg/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ljg/a$a;

.field private static final b:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljg/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljg/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljg/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljg/a$a;->a:Ljg/a$a;

    .line 7
    .line 8
    sget-object v0, Llf/p;->l:Llf/p;

    .line 9
    .line 10
    sget-object v1, Ljg/a$a$a;->k:Ljg/a$a$a;

    .line 11
    .line 12
    invoke-static {v0, v1}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Ljg/a$a;->b:Lkotlin/Lazy;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljg/a;
    .locals 1

    sget-object v0, Ljg/a$a;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg/a;

    return-object v0
.end method
