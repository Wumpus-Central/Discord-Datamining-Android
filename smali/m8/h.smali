.class public interface abstract Lm8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/d;

    invoke-direct {v0}, Lm8/d;-><init>()V

    sput-object v0, Lm8/h;->a:Lm8/h;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Ld7/k;Ljava/util/List;Lf9/l0;Ljava/util/Map;Ll7/j;)Lm8/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ld7/k;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;",
            "Lf9/l0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ll7/j;",
            ")",
            "Lm8/j;"
        }
    .end annotation
.end method
