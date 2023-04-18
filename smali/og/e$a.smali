.class public final Log/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Log/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Log/e$a;

    invoke-direct {v0}, Log/e$a;-><init>()V

    sput-object v0, Log/e$a;->a:Log/e$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llh/b;Ldi/o0;)Ldi/o0;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "computedType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
