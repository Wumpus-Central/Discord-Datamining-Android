.class final Lka/k;
.super Lka/e;
.source "SourceFile"


# instance fields
.field private final a:Lv9/c;


# direct methods
.method constructor <init>(Lv9/c;)V
    .locals 0

    invoke-direct {p0}, Lka/e;-><init>()V

    iput-object p1, p0, Lka/k;->a:Lv9/c;

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lka/k;->a:Lv9/c;

    invoke-interface {v0, p1}, Lv9/c;->b(Ljava/lang/Object;)V

    return-void
.end method
